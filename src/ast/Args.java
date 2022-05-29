package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class Args extends Node {
    private final List<Value> arguments;

    public Args(List<Value> args){
        this.arguments = args;
    }

    public List<Value> getArguments() {
        return this.arguments;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }

    @Override
    public int getType(){
        return 1;
    }
}
