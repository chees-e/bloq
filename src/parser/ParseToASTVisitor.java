package parser;
import ast.*;
import libs.*;

import java.util.ArrayList;
import java.util.List;

import parser.gen.bloqParser;
import parser.gen.bloqParserBaseVisitor;

public class ParseToASTVisitor extends bloqParserBaseVisitor<Node> {
    @Override public Program visitProgram(bloqParser.ProgramContext ctx) {
        List<Statement> statements = new ArrayList<>();

        for (bloqParser.StatementContext c: ctx.statement()) {
            statements.add(visitStatement(c));
        }

        return new Program(statements);
    }

    @Override public Statement visitStatement(bloqParser.StatementContext ctx) {
        Node statement;

        if (ctx.canvas_statement() != null) {
            statement = visitCanvas_statement(ctx.canvas_statement());
        } else if (ctx.simple_assignment_statement() != null) {
            statement = visitSimple_assignment_statement(ctx.simple_assignment_statement());
        } else if (ctx.shape_assignment_statement() != null) {
            statement = visitShape_assignment_statement(ctx.shape_assignment_statement());
        } else if (ctx.define_statement() != null) {
            statement = visitDefine_statement(ctx.define_statement());
        } else if (ctx.call_statement() != null) {
            statement = visitCall_statement(ctx.call_statement());
        } else if (ctx.block_statement() != null) {
            statement = visitBlock_statement(ctx.block_statement());
        } else if (ctx.loop_statement() != null) {
            statement = visitLoop_statement(ctx.loop_statement());
        } else if (ctx.if_statement() != null) {
            statement = visitIf_statement(ctx.if_statement());
        } else {
            return null;
        }
        return Statement(statement);
    }

    @Override public CanvasStatement visitCanvas_statement(bloqParser.Canvas_statementContext ctx) {
        int width = Integer.parseInt(ctx.NUMBER(0).getText());
        int height = Integer.parseInt(ctx.NUMBER(1).getText());

        return new CanvasStatement(width, height);
    }

    @Override public SimpleAssignmentStatement visitSimple_assignment_statement(bloqParser.Simple_assignment_statementContext ctx) {
        Variable name = visitVariable(ctx.variable());
        Expression value = visitExpression(ctx.expression());

        return new SimpleAssignmentStatement(name, value);
    }

    @Override public ShapeAssignmentStatement visitShape_assignment_statement(bloqParser.Shape_assignment_statementContext ctx) {
        List<ShapeRow> rows = new ArrayList<>();
        Variable name = visitVariable(ctx.variable());

        for (bloqParser.Shape_rowContext c: ctx.shape_row()) {
            rows.add(visitShape_row(c));
        }

        return new ShapeAssignmentStatement(name, rows);
    }

    @Override public CallStatement visitCall_statement(bloqParser.Call_statementContext ctx) {
        Variable name = visitVariable(ctx.variable());
        Args args = visitArgs(ctx.args());

        return new CallStatement(name, args);
    }

    @Override public DefineStatement visitDefine_statement(bloqParser.Define_statementContext ctx) {
        Variable name = visitVariable(ctx.variable());
        Args args = visitArgs(ctx.args());
        List<Node> statements = new ArrayList<>();

        for (bloqParser.Simple_assignment_statementContext c: ctx.simple_assignment_statement()) {
            statements.add(visitSimple_assignment_statement(c));
        }
        for (bloqParser.Shape_assignment_statementContext c: ctx.shape_assignment_statement()) {
            statements.add(visitShape_assignment_statement(c));
        }
        for (bloqParser.Block_statementContext c: ctx.block_statement()) {
            statements.add(visitBlock_statement(c));
        }
        for (bloqParser.Loop_statementContext c: ctx.loop_statement()) {
            statements.add(visitLoop_statement(c));
        }
        for (bloqParser.Call_statementContext c: ctx.call_statement()) {
            statements.add(visitCall_statement(c));
        }
        for (bloqParser.If_statementContext c: ctx.if_statement()) {
            statements.add(visitIf_statement(c));
        }

        return new DefineStatement(name, args, statements);
    }

    @Override public BlockStatement visitBlock_statement(bloqParser.Block_statementContext ctx) {
        List<BlockExtraStatement> extra = new ArrayList<>();
        List<BlockStartStatement> start = new ArrayList<>();
        List<BlockShapeStatement> shape = new ArrayList<>();

        Variable name = visitVariable(ctx.variable());

        for (bloqParser.Block_extra_statementContext c: ctx.block_extra_statement()) {
            extra.add(visitBlock_extra_statement(c));
        }
        for (bloqParser.Block_start_statementContext c: ctx.block_start_statement()) {
            start.add(visitBlock_start_statement(c));
        }
        for (bloqParser.Block_shape_statementContext c: ctx.block_shape_statement()) {
            shape.add(visitBlock_shape_statement(c));
        }

        return new BlockStatement(name, extra, start, shape);
    }

    @Override public BlockStartStatement visitBlock_start_statement(bloqParser.Block_start_statementContext ctx) {
        Value x = visitValue(ctx.value(0));
        Value y = visitValue(ctx.value(1));

        return new BlockStartStatement(x, y);
    }

    @Override public BlockShapeStatement visitBlock_shape_statement(bloqParser.Block_shape_statementContext ctx) {
        List<ShapeRow> rows = new ArrayList<>();
        if (ctx.variable() != null) {
            return new BlockShapeStatement(visitVariable(ctx.variable()))    // two types of constructor (shaperow/variable)
        } else {
            for (bloqParser.Shape_rowContext c: ctx.shape_row()) {
                rows.add(visitShape_row(c));
            }

            return new BlockShapeStatement(rows);
        }

    }

    @Override public BlockExtraStatement visitBlock_extra_statement(bloqParser.Block_extra_statementContext ctx) {
        Variable name = visitVariable(ctx.variable());

        return new BlockExtraStatement(name);
    }

    @Override public LoopStatement visitLoop_statement(bloqParser.Loop_statementContext ctx) {
        Variable var = visitVariable(ctx.variable());
        Value start = visitValue(ctx.value(0));
        Value end = visitValue(ctx.value(1));

        List<Node> statements = new ArrayList<>();

        for (bloqParser.Simple_assignment_statementContext c: ctx.simple_assignment_statement()) {
            statements.add(visitSimple_assignment_statement(c));
        }
        for (bloqParser.Shape_assignment_statementContext c: ctx.shape_assignment_statement()) {
            statements.add(visitShape_assignment_statement(c));
        }
        for (bloqParser.Block_statementContext c: ctx.block_statement()) {
            statements.add(visitBlock_statement(c));
        }
        for (bloqParser.Call_statementContext c: ctx.call_statement()) {
            statements.add(visitCall_statement(c));
        }
        for (bloqParser.If_statementContext c: ctx.if_statement()) {
            statements.add(visitIf_statement(c));
        }

        return new LoopStatement(var, start, end, statements);
    }

    @Override public IfStatement visitIf_statement(bloqParser.If_statementContext ctx) {
        List<Node> statements = new ArrayList<>();

        Condition cond = visitCondition(ctx.condition());

        for (bloqParser.Simple_assignment_statementContext c: ctx.simple_assignment_statement()) {
            statements.add(visitSimple_assignment_statement(c));
        }
        for (bloqParser.Shape_assignment_statementContext c: ctx.shape_assignment_statement()) {
            statements.add(visitShape_assignment_statement(c));
        }
        for (bloqParser.Block_statementContext c: ctx.block_statement()) {
            statements.add(visitBlock_statement(c));
        }
        for (bloqParser.Call_statementContext c: ctx.call_statement()) {
            statements.add(visitCall_statement(c));
        }

        return new IfStatement(cond, statements);
    }

    @Override public Condition visitCondition(bloqParser.ConditionContext ctx) {
        List<Expression> expressions = new ArrayList<>();

        for (bloqParser.ExpressionContext c: ctx.expression()) {
            expressions.add(visitExpression(c));
        }

        return new Condition(expressions, visitComparator(ctx.comparator()));
    }

    @Override public Expression visitExpression(bloqParser.ExpressionContext ctx) {
        List<Value> values = new ArrayList<>();
        List<Operator> operators = new ArrayList<>();

        for (bloqParser.ValueContext c: ctx.value()) {
            values.add(visitValue(c));
        }

        for (bloqParser.OperatorContext c: ctx.operator()) {
            operators.add(visitOperator(c));
        }

        return new Expression(values, operators);
    }

    @Override public Args visitArgs(bloqParser.ArgsContext ctx) {
        List<Value> args = new ArrayList<>();

        for (bloqParser.ValueContext c: ctx.value()) {
            args.add(visitValue(c));
        }
        return new Args(args);
    }

    @Override public ShapeRow visitShape_row(bloqParser.Shape_rowContext ctx) {
        return new ShapeRow(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override public Variable visitVariable(bloqParser.VariableContext ctx) {
        return new Variable(ctx.TEXT().getText());
    }

    @Override public Value visitValue(bloqParser.ValueContext ctx) {
        if (ctx.NUMBER() != null) {
            return new Value(Integer.parseInt(ctx.NUMBER().getText())); // two constructors
        } else if (ctx.TEXT() != null) {
            return new Value(ctx.TEXT().getText());
        } else {
            return null;
        }
    }

    @Override public Comparator visitComparator(bloqParser.ComparatorContext ctx) {
        String comp;

        if (ctx.GREATER() != null) {
            comp = ctx.GREATER().getText();
        } else if (ctx.LESS() != null) {
            comp = ctx.LESS().getText();
        } else if (ctx.GREATEREQ() != null) {
            comp = ctx.GREATEREQ().getText();
        } else if (ctx.LESSRQ() != null) { //typo i know TODO fix
            comp = ctx.LESSRQ().getText();
        } else if (ctx.EQUAL() != null) {
            comp = ctx.EQUAL().getText();
        } else if (ctx.NOTEQ() != null) {
            comp = ctx.NOTEQ().getText();
        } else {
            return null; // default
        }

        return Comparator(comp);
    }

    @Override public Operator visitOperator(bloqParser.OperatorContext ctx) {
        String op;

        if (ctx.PLUS() != null) {
            op = ctx.PLUS().getText();
        } else if (ctx.MINUS() != null) {
            op = ctx.MINUS().getText();
        } else if (ctx.MULTIPLY() != null) {
            op = ctx.MULTIPLY().getText();
        } else if (ctx.DIVIDE() != null) {
            op = ctx.DIVIDE().getText();
        } else if (ctx.MODULO() != null) {
            op = ctx.MODULO().getText();
        } else {
            return null; // default
        }

        return new Operator(op);
    }
}
