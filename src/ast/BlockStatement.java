package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class BlockStatement extends Node {
    private final List<BlockStartStatement> start;
    private final List<BlockShapeStatement> shape;
    private final Args name;

    public BlockStatement (Args name,
                                List<BlockStartStatement> start,
                                List<BlockShapeStatement> shape){
        this.start = start;
        this.shape = shape;
        this.name = name;
    }


    public List<BlockShapeStatement> getShape() {
        return shape;
    }

    public List<BlockStartStatement> getStart() {
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
