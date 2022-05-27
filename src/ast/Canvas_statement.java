package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;
import java.io.PrintWriter;

public class Canvas_statement extends Node {
    private final int height;
    private final int width;

    public Canvas_statement(int h, int w) {
        this.height = h;
        this.width = w;
    };

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }


    @Override
    public void accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(writer);
    }
}
