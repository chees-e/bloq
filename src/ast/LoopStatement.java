package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class LoopStatement extends Node {
    private final Variable var;
    private final Value start;
    private final Value end;
    private final List<Node> statements;

    public LoopStatement(Variable var, Value start, Value end, List<Node> statements){
        this.var = var;
        this.start = start;
        this.end = end;
        this.statements = statements;
    }

    public List<Node> getStatements() {
        return statements;
    }

    public Variable getVar() {
        return var;
    }

    public Value getEnd() {
        return end;
    }

    public Value getStart() {
        return start;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
