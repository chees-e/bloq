package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class SimpleAssignmentStatement extends Node {
    private final Variable name;
    private final Expression value;

    public SimpleAssignmentStatement(Variable name, Expression value){
        this.name = name;
        this.value = value;
    }

    public Variable getName() {
        return name;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
