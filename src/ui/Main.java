// Copied from lecture

package ui;

import libs.Node;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import parser.BloqLexer;
import parser.BloqParser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BloqLexer lexer = new BloqLexer(CharStreams.fromFileName("input.bloq"));
        for (Token token : lexer.getAllTokens()) {
            System.out.println(token);
        }
        lexer.reset();
        TokenStream tokens = new CommonTokenStream(lexer);
        System.out.println("Done tokenizing");

        BloqParser parser = new BloqParser(tokens);
        Program parsedProgram = parser.parseProgram();
        System.out.println("Done parsing");

        PrintWriter out = new PrintWriter(new FileWriter("output.py"));
        //   Create evaluator
        // parsedProgram.evaluate(out);
        // out.close();
        // System.out.println("Done evaluation");
    }

}
