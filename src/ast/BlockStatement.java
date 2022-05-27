package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class BlockStatement extends Node {
    private final List<BlockExtraStatement> extra;
    private final List<BlockStartStatement> start;
    private final List<BlockShapeStatement> shape;
    private final Variable name;

    public BlockStatement (Variable name,
                           List<BlockExtraStatement> extra,
                                List<BlockStartStatement> start,
                                List<BlockShapeStatement> shape){
        this.extra = extra;
        this.start = start;
        this.shape = shape;
        this.name = name;
    }

    public List<BlockExtraStatement> getExtra() {
        return extra;
    }

    public List<BlockShapeStatement> getShape() {
        return shape;
    }

    public List<BlockStartStatement> getStart() {
        return start;
    }

    public Variable getName() {
        return name;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
