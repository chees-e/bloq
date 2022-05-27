package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Operator extends Node {
    private final String op;

    public Operator(String op){
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
