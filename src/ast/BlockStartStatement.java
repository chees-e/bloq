package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class BlockStartStatement extends Node {
    public final Value x;
    public final Value y;

    public BlockStartStatement (Value x, Value y){
        this.x = x;
        this.y = y;
    }

    public Value getX() {
        return x;
    }

    public Value getY() {
        return y;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 3;
    }
}