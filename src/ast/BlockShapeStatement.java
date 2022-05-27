package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class BlockShapeStatement extends Node {
    public final List<ShapeRow> rows;
    public final Variable var;

    public BlockShapeStatement(List<ShapeRow> rows){
        this.rows = rows;
        this.var = null;
    }

    public BlockShapeStatement(Variable var){
        this.rows = null;
        this.var = var;
    }

    public List<ShapeRow> getRows() {
        return rows;
    }

    public Variable getVar() {
        return var;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
