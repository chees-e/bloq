package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class BlockShapeStatement extends Node {

    @Override
    public int accept(BloqVisitor visitor, PrintWriter writer) {

        return 0;
    }
}
