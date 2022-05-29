package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Variable extends Node {
    private final String varStr;

    public Variable(String varStr){
        this.varStr = varStr;
    }

    public String getVarStr() {
        return varStr;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }

    @Override
    public int getType(){
        return 20;
    }
}
