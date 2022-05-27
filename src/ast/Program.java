package ast;
import ast.evaluator.BloqVisitor;
import libs.Node;
import java.io.PrintWriter;

public class Program extends Node {
    public void Program() {
        return;
    };

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return 0;
    }
}
