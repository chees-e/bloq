    package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class IfStatement extends Node {
    private final List<Node> statements;
    private final Condition cond;
    private final LinkedCondition linked_cond;

    public IfStatement(Condition cond, LinkedCondition linked_cond, List<Node> statements){
        this.statements = statements;
        this.cond = cond;
        this.linked_cond = linked_cond;
    }

    public List<Node> getStatements() {
        return statements;
    }

    public Condition getCond() {
        return cond;
    }

    public LinkedCondition getLinkedCond() { return linked_cond; };

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 11;
    }
}
