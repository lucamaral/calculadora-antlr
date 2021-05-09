package br.com.handit.calculadora_antlr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.handit.calculadora.Calculadora;

public class CalculadoraTest {

    @Test
    public void testeCalculadoraDesafio1() {
        assertEquals(6D, (Double)Calculadora.resolverExpressao("1+5"), 0D);
        assertEquals(-4D, Calculadora.resolverExpressao("1-5"), 0D);
        assertEquals(5D, Calculadora.resolverExpressao("1*5"), 0D);
        assertEquals(0.2D, Calculadora.resolverExpressao("1/5"), 0D);
        assertEquals(3125D, Calculadora.resolverExpressao("5^5"), 0D);
        assertEquals(40.22D, Calculadora.resolverExpressao("(1+(10+20*100))/50"), 0D);
        assertEquals(1900D, Calculadora.resolverExpressao("((100/5)*100)-100"), 0D);
    }

    @Test
    public void testeCalculadoraDesafio2() {
        final String expressao1 = "a = 1+2\r\n" + "b = a^2\r\n" + "c = a + b * (a - 1)\r\n" + "a + b + c";
        System.out.println(expressao1);
        System.out.println(Calculadora.resolverExpressaoComVariaveis("a = 1+2\r\n" + "a"));
        assertEquals(33.0D, Calculadora.resolverExpressaoComVariaveis(expressao1), 0D);
    }
}
