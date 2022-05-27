package ast.evaluator;

import ast.*;

import java.io.PrintWriter;

public class PyEvaluator implements BloqVisitor{

    @Override
    public int visit(Program p, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(Statement s, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(CanvasStatement c, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(SimpleAssignmentStatement s, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(ShapeAssignmentStatement s, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(CallStatement c, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(DefineStatement d, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(BlockStatement b, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(BlockStartStatement b, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(BlockShapeStatement b, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(LoopStatement l, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(IfStatement i, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(Condition c, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(Expression e, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(Args a, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(ShapeRow s, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(Variable v, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(Value v, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(Comparator c, PrintWriter printWriter) {
        return 0;
    }

    @Override
    public int visit(Operator o, PrintWriter printWriter) {
        return 0;
    }
}
