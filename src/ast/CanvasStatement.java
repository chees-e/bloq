package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;
import java.io.PrintWriter;

public class CanvasStatement extends Node {
    private final int height;
    private final int width;

    public CanvasStatement(int h, int w) {
        this.height = h;
        this.width = w;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }


    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
