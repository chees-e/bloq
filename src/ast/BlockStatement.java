package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class BlockStatement extends Node {
    private final BlockStartStatement start;
    private final BlockShapeStatement shape;
    private final Args name;

    public BlockStatement (Args name,
                                BlockStartStatement start,
                                BlockShapeStatement shape){
        this.start = start;
        this.shape = shape;
        this.name = name;
    }


    public BlockShapeStatement getShape() {
        return shape;
    }

    public BlockStartStatement getStart() {
        return start;
    }

    public Args getName() {
        return name;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }

    @Override
    public int getType(){
        return 4;
    }
}
