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
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }

    @Override
    public int getType(){
        return 11;
    }
}
