package ui.controller;

import ast.evaluator.BloqVisitor;
import ast.evaluator.PyEvaluator;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.scene.layout.*;
import libs.Node;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import parser.ParseToASTVisitor;
import parser.gen.bloqLexer;
import parser.gen.bloqParser;

import javax.imageio.ImageIO;

public class EditorController {
    @FXML
    private Button runButton;

    @FXML
    private TextArea editorTextArea;

    @FXML
    private ImageView outputImageView;

    @FXML
    private AnchorPane rightPane;

    @FXML
    public void runButtonClicked(ActionEvent event) {
        try {
            String input = editorTextArea.getText();

            bloqLexer lexer = new bloqLexer(CharStreams.fromString(input));
            for (Token token : lexer.getAllTokens()) {
                System.out.println(token);
            }
            lexer.reset();
            TokenStream tokens = new CommonTokenStream(lexer);
            System.out.println("Done tokenizing");

            bloqParser parser = new bloqParser(tokens);
            ParseToASTVisitor visitor = new ParseToASTVisitor();
            Node parsedProgram = (Node)parser.program().accept(visitor);
            System.out.println("Done parsing");

            System.out.println(parser);


            PrintWriter out = new PrintWriter(new FileWriter("output.py"));
            BloqVisitor eval = new PyEvaluator();
            parsedProgram.accept(eval, out);
            out.close();
            System.out.println("Done evaluation");
            Process process = Runtime.getRuntime().exec("python3 ./output.py");
            int exitcode = process.waitFor();
            System.out.println(exitcode);

            // referred to https://stackoverflow.com/questions/26712643/javafx-imageview-set-center-image  and
            // official documentation https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/BackgroundSize.html
            // to set the image as the background and resizable with window resizing
            File imageFile = new File("output.png");
            BufferedImage bufferedImage = ImageIO.read(imageFile);
            Image image = SwingFXUtils.toFXImage(bufferedImage, null);
            BackgroundSize backgroundSize = new BackgroundSize(450, 450, false, false, true, false);
            BackgroundImage backgroundImage = new BackgroundImage(image,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    backgroundSize);
            rightPane.setBackground(new Background(backgroundImage));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
