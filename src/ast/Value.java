package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Value extends Node {
    private final int valueInt;
    private final String valueStr;

    public Value(int valueInt){
        this.valueInt = valueInt;
        this.valueStr = null;
    }

    public Value(String valueStr){
        this.valueInt = Integer.parseInt(null);
        this.valueStr = valueStr;
    }

    public int getValueInt() {
        return valueInt;
    }

    public String getValueStr() {
        return valueStr;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
