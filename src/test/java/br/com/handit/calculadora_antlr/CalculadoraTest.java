package br.com.handit.calculadora_antlr;

import br.com.handit.calculadora_antlr.exceptions.VarNotDefinedException;
import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {

	public void testeCalculadoraDesafio1() {
		assertEquals(6D, Calculadora.resolverExpressao("1+ 5"));
		assertEquals(-4D, Calculadora.resolverExpressao("1 -5"));
		assertEquals(5D, Calculadora.resolverExpressao("1 * 5"));
		assertEquals(0.2D, Calculadora.resolverExpressao("1/5"));
		assertEquals(3125D, Calculadora.resolverExpressao("5^5"));
		assertEquals(11D, Calculadora.resolverExpressao("1+5*2"));
		assertEquals(7D, Calculadora.resolverExpressao("1.222+5.778"));
		assertEquals(6.778D, Calculadora.resolverExpressao("1+5.778"));
		assertEquals(40.22D, Calculadora.resolverExpressao("(1+(10+20*100))/50"));
		assertEquals(40.22D, Calculadora.resolverExpressao("(1+(10+20*100))\n /50"));
		assertEquals(40.22D, Calculadora.resolverExpressao("(1+(10+20*100)) \n/50"));
		assertEquals(40.22D, Calculadora.resolverExpressao("(1+(10+20*100))\n/50"));
		assertEquals(40.22D, Calculadora.resolverExpressao("(1+(10+20*100))\r\n/50"));
		assertEquals(1900D, Calculadora.resolverExpressao("((100/5)*100)-100"));
	}

	public void testeCalculadoraDesafio2() {
		final String expressao1 = "a := 1+2\r\n" + "b = a^2\r\n" + "c = a + b * (a - 1)\r\n" + "a + b + c";
		assertEquals(33.0D, Calculadora.resolverExpressaoComVariaveis(expressao1));

		final String expressao2 = "_a1 := 1+2\r\n" + "b_ = _a1^2\r\n" + "c = _a1 + b_ * (_a1 - 1)\r\n" + "_a1 + b_ + c";
		assertEquals(33.0D, Calculadora.resolverExpressaoComVariaveis(expressao2));

		try {
			final String expressao3 = "a1 := 1+2\r\n" + "b = a1^2\r\n" + "c = a1 + b * (a - 1)\r\n" + "a1 + b + c";
			Calculadora.resolverExpressaoComVariaveis(expressao3);
			fail("Exception expected");
		} catch (VarNotDefinedException e) {
			assertEquals("var 'a' was not defined at line 3, column 14", e.getMessage());
		}
		
		final String expressao4 = "f := 1+2\r\n" + "a := f\r\n" + "b = a^2\r\n" + "c = a + b * (a - 1)\r\n" + "a + b + c";
		assertEquals(33.0D, Calculadora.resolverExpressaoComVariaveis(expressao4));

		
	}
}
