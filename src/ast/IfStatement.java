    package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class IfStatement extends Node {
    private final List<Node> statements;
    private final Condition cond;

    public IfStatement(Condition cond, List<Node> statements){
        this.statements = statements;
        this.cond = cond;
    }

    public List<Node> getStatements() {
        return statements;
    }

    public Condition getCond() {
        return cond;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 11;
    }
}
