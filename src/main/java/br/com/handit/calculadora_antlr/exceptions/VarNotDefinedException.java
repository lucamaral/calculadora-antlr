package br.com.handit.calculadora_antlr.exceptions;

public class VarNotDefinedException extends RuntimeException {

	public VarNotDefinedException() {
		super();
	}

	public VarNotDefinedException(String msg) {
		super(msg);
	}

	public VarNotDefinedException(String message, Throwable cause) {
		super(message, cause);
	}

}
