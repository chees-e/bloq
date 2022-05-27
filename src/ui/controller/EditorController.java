package ui.controller;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

    public void init() {

    }

    @FXML
    public void runButtonClicked(ActionEvent event) {

        try {
            String input = editorTextArea.getText();
            System.out.println(input);
            File imageFile = new File("output.png");
            BufferedImage image = ImageIO.read(imageFile);
            outputImageView.setImage(SwingFXUtils.toFXImage(image, null));

//            bloqLexer lexer = new bloqLexer(CharStreams.fromFileName("input.bloq"));
//            for (Token token : lexer.getAllTokens()) {
//                System.out.println(token);
//            }
//            lexer.reset();
//            TokenStream tokens = new CommonTokenStream(lexer);
//            System.out.println("Done tokenizing");
//
//            bloqParser parser = new bloqParser(tokens);
//            ParseToASTVisitor visitor = new ParseToASTVisitor();
//            Node parsedProgram = parser.program().accept(visitor);
//            System.out.println("Done parsing");
//
//            System.out.println(parser);
//
//            PrintWriter out = new PrintWriter(new FileWriter("output.py"));
            //   Create evaluator
            // parsedProgram.evaluate(out);
            // out.close();
            // System.out.println("Done evaluation");
        } catch (Exception e) {
            System.out.println("Failed to write file");
        }
    }
}
