package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class DefineStatement extends Node {
    private final Variable name;
    private final Args args;
    private final List<Node> statements;

    public DefineStatement(Variable name, Args args, List<Node> statements){
        this.name = name;
        this.args = args;
        this.statements = statements;
    }

    public Args getArgs() {
        return args;
    }

    public Variable getName() {
        return name;
    }

    public List<Node> getStatements() {
        return statements;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 9;
    }
}
