package ast;
import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Statement extends Node {
    private final Node statement;

    public Statement(Node statement) {
        this.statement = statement;
    }

    public Node getStatement() {
        return statement;
    }

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {
        return visitor.visit(this, writer);
    }

    @Override
    public int getType(){
        return 18;
    }
}
