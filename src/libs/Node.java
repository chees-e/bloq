package libs;

import ast.evaluator.BloqVisitor;

import java.io.PrintWriter;

public abstract class Node {
    public abstract int accept(BloqVisitor visitor, PrintWriter writer); // Add printer
}
