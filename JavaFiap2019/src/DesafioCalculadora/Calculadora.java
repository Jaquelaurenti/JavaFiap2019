package DesafioCalculadora;

import javax.swing.JOptionPane;

public class Calculadora implements CalculadoraBasica{

	@Override
	public float somar(double op1, double op2) {
		float resultado;
		resultado = (float) (op1+op2);
		return resultado;
	}

	@Override
	public float subtrair(double op1, double op2) {
		float resultado;
		resultado = (float) (op1-op2);
		return resultado;
	}

	@Override
	public float dividir(double op1, double op2) {
		float resultado;
		resultado = (float) (op1*op2);
		return resultado;
	}

	@Override
	public float multiplicar(double op1, double op2) {
		float resultado;
		resultado = (float) (op1/op2);
		return resultado;
	}
	
	public void mostrarResultado(float resultado, String operacao) {
		JOptionPane.showMessageDialog(null, "O resultado da " + operacao + " é de: " + resultado);	
	}
}
