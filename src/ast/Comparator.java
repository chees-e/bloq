package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Comparator extends Node {
    public final String comp;

    public Comparator(String comp){
        this.comp = comp;
    }

    public String getComp() {
        return comp;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }
}
