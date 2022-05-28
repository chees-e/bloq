// Copied from lecture

package ui;

import ast.evaluator.BloqVisitor;
import ast.evaluator.PyEvaluator;
import libs.Node;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.runtime.MismatchedTokenException;
import parser.ParseToASTVisitor;
import parser.gen.bloqLexer;
import parser.gen.bloqParser;


import ast.Program;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException, MismatchedTokenException, InterruptedException {


        bloqLexer lexer = new bloqLexer(CharStreams.fromFileName("input.bloq"));
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
        Process process = Runtime.getRuntime().exec("python ./output.py");
        int exitcode = process.waitFor();
        System.out.println(exitcode);
    }

}
