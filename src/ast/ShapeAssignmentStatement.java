package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class ShapeAssignmentStatement extends Node {
    private final List<ShapeRow> rows;
    private final Variable name;

    public ShapeAssignmentStatement(Variable name, List<ShapeRow> rows){
        this.name = name;
        this.rows = rows;
    }

    public Variable getName() {
        return name;
    }

    public List<ShapeRow> getRows() {
        return rows;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }

    @Override
    public int getType(){
        return 15;
    }
}
