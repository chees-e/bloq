package ast;
import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Statement extends Node {
    public void Statement() {
        return;
    };

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return 0;
    }
}
