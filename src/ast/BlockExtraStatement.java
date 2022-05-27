package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class BlockExtraStatement extends Node {
    private final Variable name;

    public BlockExtraStatement (Variable name){
        this.name = name;
    }

    public Variable getName() {
        return name;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
