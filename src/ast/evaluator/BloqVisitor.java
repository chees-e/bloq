package ast.evaluator;

import ast.*;

import java.io.PrintWriter;

public interface BloqVisitor<T> {
    int visit(Program p, T param);

    int visit(Statement s, T param);

    int visit(CanvasStatement c, T param);

    int visit(SimpleAssignmentStatement s, T param);

    int visit(ShapeAssignmentStatement s, T param);

    int visit(CallStatement c, T param);

    int visit(DefineStatement d, T param);

    int visit(BlockStatement b, T param);

    int visit(BlockStartStatement b, T param);

    int visit(BlockShapeStatement b, T param);

    int visit(LoopStatement l, T param);

    int visit(IfStatement i, T param);

    int visit(Condition c, T param);

    int visit(Expression e, T param);

    int visit(Args a, T param);

    int visit(ShapeRow s, T param);

    int visit(Variable v, T param);

    int visit(Value v, T param);

    int visit(Comparator c, T param);

    int visit(Operator o, T param);
}
