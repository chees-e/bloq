package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class Condition extends Node {
    private final List<Expression> expressions;
    private final Comparator comp;

    public Condition(List<Expression> expressions, Comparator comp){
        this.expressions = expressions;
        this.comp = comp;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Comparator getComp() {
        return comp;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
