package ast.evaluator;

import ast.*;

import java.io.PrintWriter;

public interface BloqVisitor {
    int visit(Program p, PrintWriter printWriter);

    int visit(Statement s, PrintWriter printWriter);

    int visit(CanvasStatement c, PrintWriter printWriter);

    int visit(SimpleAssignmentStatement s, PrintWriter printWriter);

    int visit(ShapeAssignmentStatement s, PrintWriter printWriter);

    int visit(CallStatement c, PrintWriter printWriter);

    int visit(DefineStatement d, PrintWriter printWriter);

    int visit(BlockStatement b, PrintWriter printWriter);

    int visit(BlockStartStatement b, PrintWriter printWriter);

    int visit(BlockShapeStatement b, PrintWriter printWriter);

    int visit(BlockExtraStatement b, PrintWriter printWriter);

    int visit(LoopStatement l, PrintWriter printWriter);

    int visit(IfStatement i, PrintWriter printWriter);

    int visit(Condition c, PrintWriter printWriter);

    int visit(Expression e, PrintWriter printWriter);

    int visit(Args a, PrintWriter printWriter);

    int visit(ShapeRow s, PrintWriter printWriter);

    int visit(Variable v, PrintWriter printWriter);

    int visit(Value v, PrintWriter printWriter);

    int visit(Comparator c, PrintWriter printWriter);

    int visit(Operator o, PrintWriter printWriter);
}
