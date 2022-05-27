package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Value extends Node {
    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {

        return 0;
    }
}
