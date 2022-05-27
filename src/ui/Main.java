// Copied from lecture

package ui;

import libs.Node;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.runtime.MismatchedTokenException;
import parser.ParseToASTVisitor;
import parser.gen.bloqLexer;
import parser.gen.bloqParser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


import ast.Program;
import ui.controller.EditorController;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends Application{
    Stage window;
    Scene scene;

    public static void main(String[] args) throws IOException, MismatchedTokenException {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException, MismatchedTokenException {
        window = stage;
        window.setTitle("bloq");
        editorScene();
//         todo: move all these to the button event
//        bloqLexer lexer = new bloqLexer(CharStreams.fromFileName("input.bloq"));
//        for (Token token : lexer.getAllTokens()) {
//            System.out.println(token);
//        }
//        lexer.reset();
//        TokenStream tokens = new CommonTokenStream(lexer);
//        System.out.println("Done tokenizing");
//
//        bloqParser parser = new bloqParser(tokens);
//        ParseToASTVisitor visitor = new ParseToASTVisitor();
//        Node parsedProgram = parser.program().accept(visitor);
//        System.out.println("Done parsing");
//
//        System.out.println(parser);
//
//
//        PrintWriter out = new PrintWriter(new FileWriter("output.py"));
//        //   Create evaluator
//        // parsedProgram.evaluate(out);
//        // out.close();
//        // System.out.println("Done evaluation");
    }

    private void editorScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("editor.fxml"));
        Parent root = loader.load();
        EditorController controller = loader.getController();
        controller.init();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("editor.css").toExternalForm());
        window.setScene(scene);
        window.show();
    }

}
