package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class ShapeRow extends Node {
    private final int shaperow;

    public ShapeRow(int shaperow){
        this.shaperow = shaperow;
    }

    public int getShaperow() {
        return shaperow;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
