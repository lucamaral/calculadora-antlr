package br.com.handit.calculadora;

import java.util.HashMap;
import java.util.Map;

import br.com.handit.calculadora.parser.CalculadoraDesafio2Parser;
import br.com.handit.calculadora.parser.CalculadoraDesafio2BaseVisitor;
import br.com.handit.calculadora.parser.CalculadoraDesafio2Parser.AddSubContext;
import br.com.handit.calculadora.parser.CalculadoraDesafio2Parser.AssignContext;
import br.com.handit.calculadora.parser.CalculadoraDesafio2Parser.FloatContext;
import br.com.handit.calculadora.parser.CalculadoraDesafio2Parser.MulDivContext;
import br.com.handit.calculadora.parser.CalculadoraDesafio2Parser.ParensContext;
import br.com.handit.calculadora.parser.CalculadoraDesafio2Parser.PotContext;
import br.com.handit.calculadora.parser.CalculadoraDesafio2Parser.VarContext;

public class CalculadoraDesafio2Visitor extends CalculadoraDesafio2BaseVisitor<Double> {
    final Map<String, Double> memory = new HashMap<String, Double>();

    @Override
    public Double visitPot(final PotContext ctx) {
        final Double left = visit(ctx.expr(0));
        final Double right = visit(ctx.expr(1));
        
        return Math.pow(left, right);
    }
    
    @Override
    public Double visitAssign(final AssignContext ctx) {
        final String var = ctx.VAR().getText();
        final Double value = visit(ctx.expr());
        
        memory.put(var, value);
        
        return value;
    }
    
    @Override
    public Double visitFloat(final FloatContext ctx) {
        return Double.valueOf(ctx.FLOAT().getText());
    }
    
    @Override
    public Double visitVar(final VarContext ctx) {
        final String var = ctx.VAR().getText();
        
        if (memory.containsKey(var)) {
            return memory.get(var);
        }
        
        return 0D;
    }

    @Override
    public Double visitMulDiv(final MulDivContext ctx) {
        final Double left = visit(ctx.expr(0));
        final Double right = visit(ctx.expr(1));
        
        if (ctx.operator.getType() == CalculadoraDesafio2Parser.MUL) {
            return left * right;
        }
        
        return left / right;
    }

    @Override
    public Double visitAddSub(final AddSubContext ctx) {
        final Double left = visit(ctx.expr(0));
        final Double right = visit(ctx.expr(1));
        
        if (ctx.operator.getType() == CalculadoraDesafio2Parser.ADD) {
            return left + right;
        }
        
        return left - right;
    }

    @Override
    public Double visitParens(final ParensContext ctx) {
        return visit(ctx.expr());
    }
}
