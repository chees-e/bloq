package ast.evaluator;

import ast.*;
import ast.Comparator;
import libs.Node;

import java.util.*;

public class VariableValidator implements BloqVisitor<StringBuilder, String>{

    private final Map<String, Expression> assignmentTable = new HashMap<>();

    private final Map<String, List<Node>> functionTable = new HashMap<>();

    private final List<String> illegalNames = Arrays.asList("call", "canvas", "block", "start", "shape", "name", "for",
            "if", "define");

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
        System.out.println("Visiting canvas statement validation.");
        if (c.getWidth() < 1) {
            return "Error: Cannot have canvas width less than 1. \n";
        } else if (c.getHeight() < 1) {
            return "Error: Cannot have canvas height less than 1. \n";
        }
        return "";
    }

    @Override
    public String visit(SimpleAssignmentStatement s, StringBuilder param) {
        System.out.println("Visiting simple assignment statement validation.");
        String checkName = s.getName().accept(this, param);
        String checkExp = s.getValue().accept(this, param);
        if (!Objects.equals(checkName + checkExp, "")){
            return checkName + checkExp;
        }

        String name = s.getName().getVarStr();
        if (functionTable.containsKey(name)) {
            return "Error: variable name has already been used as a function name. \n";
        }
        assignmentTable.put(name, s.getValue());
        return "";
    }

    @Override
    public String visit(ShapeAssignmentStatement s, StringBuilder param) {
        System.out.println("Visiting shape assignment statement validation.");
        String checkName = s.getName().accept(this, param);
        if (!Objects.equals(checkName, "")){
            return checkName;
        }

        String name = s.getName().getVarStr();
        if (functionTable.containsKey(name)) {
            return "Error: variable name has already been used as a function name. \n";
        }

        assignmentTable.put(name, null);
        return "";
    }

    @Override
    public String visit(CallStatement c, StringBuilder param) {
        System.out.println("Visiting call statement validation.");
        if (!functionTable.containsKey(c.getName().getVarStr())) {
            return "Error: attempting to call function that was not defined. \n";
        }
        return "";
    }

    @Override
    public String visit(DefineStatement d, StringBuilder param) {
        System.out.println("Visiting define statement validation.");

        String checkName = d.getName().accept(this, param);
        String checkArgs = d.getArgs().accept(this, param);

        if (!Objects.equals(checkName + checkArgs, "")){
            return checkName + checkArgs;
        }

        for (Node statement: d.getStatements()) {
            String error = statement.accept(this, param);
            if (!Objects.equals(error, "")) {
                return error;
            }
        }

        String name = d.getName().getVarStr();
        if (assignmentTable.containsKey(name)) {
            return "Error: function name has already been used as a variable name. \n";
        }
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
        System.out.println("Visiting block shape statement validation.");
        return b.getVar().accept(this, param);
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

        // TODO: FIX, I MODIFIED TO AVOID ERROR
        if (i.getCond() != null) {
            return i.getCond().accept(this, param);
        } else {
            return "";
        }
    }

    @Override
    public String visit(LinkedCondition c, StringBuilder param) {
        // TODO

        return "";
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
        System.out.println("Visiting variable validation.");
        String name = v.getVarStr();
        if (illegalNames.contains(name)) {
            return "Error: variable name cannot be one of the predefined keywords: " + illegalNames.toString();
        }
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

    @Override
    public String visit(LogicOperator o, StringBuilder param) {
        // TODO

        return "";
    }
}
