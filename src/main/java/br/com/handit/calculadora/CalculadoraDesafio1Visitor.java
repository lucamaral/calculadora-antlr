package br.com.handit.calculadora;

import br.com.handit.calculadora.parser.CalculadoraDesafio1BaseVisitor;
import br.com.handit.calculadora.parser.CalculadoraDesafio1Parser;
import br.com.handit.calculadora.parser.CalculadoraDesafio1Parser.AddSubContext;
import br.com.handit.calculadora.parser.CalculadoraDesafio1Parser.MulDivContext;
import br.com.handit.calculadora.parser.CalculadoraDesafio1Parser.ParensContext;
import br.com.handit.calculadora.parser.CalculadoraDesafio1Parser.PotContext;

public class CalculadoraDesafio1Visitor extends CalculadoraDesafio1BaseVisitor<Double> {
    
    @Override
    public Double visitFloat(final CalculadoraDesafio1Parser.FloatContext ctx) {
        return Double.valueOf(ctx.FLOAT().getText());
    }

    @Override
    public Double visitPot(final PotContext ctx) {
        final Double left = visit(ctx.expr(0));
        final Double right = visit(ctx.expr(1));
        
        return Math.pow(left, right);
    }
    
    @Override
    public Double visitMulDiv(final MulDivContext ctx) {
        final Double left = visit(ctx.expr(0));
        final Double right = visit(ctx.expr(1));
        
        if (ctx.operator.getType() == CalculadoraDesafio1Parser.MUL) {
            return left * right;
        }
        
        return left / right;
    }

    @Override
    public Double visitAddSub(final AddSubContext ctx) {
        final Double left = visit(ctx.expr(0));
        final Double right = visit(ctx.expr(1));
        
        if (ctx.operator.getType() == CalculadoraDesafio1Parser.ADD) {
            return left + right;
        }
        return left - right;
    }

    @Override
    public Double visitParens(final ParensContext ctx) {
        return visit(ctx.expr());
    }
}
