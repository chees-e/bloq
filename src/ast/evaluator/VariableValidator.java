package ast.evaluator;

import ast.*;
import ast.Comparator;
import libs.Node;

import java.io.PrintWriter;
import java.util.*;

public class VariableValidator implements BloqVisitor<StringBuilder, String>{

    private final Map<String, String> symbolTable = new HashMap<>();

    private int nextLocation = 1;

    @Override
    public String visit(Program p, StringBuilder param) {
        System.out.println("Visiting program validation.");
        StringBuilder totalErrors = new StringBuilder();
        for (Node statement: p.getStatements()) {
            String currError = statement.accept(this, param);
            if (!Objects.equals(currError, "")) {
                totalErrors.append(currError);
            }
        }
        return totalErrors.toString();
    }

    @Override
    public String visit(Statement s, StringBuilder param) {
        System.out.println("Visiting statement validation.");
        Node statement = s.getStatement();
        return statement.accept(this, param);
    }

    @Override
    public String visit(CanvasStatement c, StringBuilder param) {
        if (c.getWidth() < 1) {
            return "Cannot have canvas width less than 1";
        } else if (c.getHeight() < 1) {
            return "Cannot have canvas height less than 1";
        }
        return "";
    }

    @Override
    public String visit(SimpleAssignmentStatement s, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(ShapeAssignmentStatement s, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(CallStatement c, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(DefineStatement d, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(BlockStatement b, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(BlockStartStatement b, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(BlockShapeStatement b, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(LoopStatement l, StringBuilder param) {
        System.out.println("Visiting loop statement validation.");
        StringBuilder totalErrors = new StringBuilder();
        for (Node statement: l.getStatements()) {
            String currError = statement.accept(this, param);
            if (!Objects.equals(currError, "")) {
                totalErrors.append(currError);
            }
        }
        return totalErrors.toString();
    }

    @Override
    public String visit(IfStatement i, StringBuilder param) {
        System.out.println("Visiting if statement validation.");
        return i.getCond().accept(this, param);
    }

    @Override
    public String visit(Condition c, StringBuilder param) {
        System.out.println("Visiting condition statement validation.");
        System.out.println(c.getExpressions());
        if (c.getExpressions().size() != 2) {
            return "Error in condition definition, you must compare 2 items. \n";
        }
        return c.getExpressions().get(0).accept(this, param) + c.getExpressions().get(1).accept(this, param);
    }

    @Override
    public String visit(Expression e, StringBuilder param) {
        System.out.println("Visiting expression validation.");
        System.out.println(e.getValues());
        System.out.println(e.getOperators());
        if (e.getValues().isEmpty() || e.getValues().get(0) == null) {
            return "Missing value for expression, you must provide at least one integer. \n";
        } else if (e.getValues().size() != e.getOperators().size() + 1 || e.getValues().contains(null)) {
            return "Number of values for expressions must be exactly 1 greater than the number of operators. \n";
        } else if (e.getOperators().size() != 0 && e.getValues().get(1) == null) {
            return "Must have 2 values for expressions with an operator. \n";
        }

        if (e.getOperators().size() != 0) {
            return e.getValues().get(0).accept(this, param) +
                    e.getOperators().get(0).accept(this, param) +
                    e.getValues().get(1).accept(this, param);
        } else {
            return e.getValues().get(0).accept(this, param);
        }
    }

    @Override
    public String visit(Args a, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(ShapeRow s, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(Variable v, StringBuilder param) {

        return "";
    }

    @Override
    public String visit(Value v, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(Comparator c, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(Operator o, StringBuilder param) {
        List<String> operators = Arrays.asList("+", "-", "*", "/", "%");
        if (!operators.contains(o.getOp())) {
            return "Error, operator is not supported. \n";
        }
        return "";
    }

    public Map<String, String> getSymbolTable() {
        return symbolTable;
    }
}
