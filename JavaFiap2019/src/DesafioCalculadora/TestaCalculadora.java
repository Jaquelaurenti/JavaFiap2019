package DesafioCalculadora;

import javax.swing.JOptionPane;

public class TestaCalculadora {

	public static void main(String[] args) {

		Calculadora cb = new Calculadora();

		String n1;
		String n2;
		String operacao;
		double resultado;
		int i = 0;
		while (i == 0) {
			n1 = JOptionPane.showInputDialog("Digite o primeiro número:");
			if (!n1.matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$")) {
				operacao = JOptionPane.showInputDialog("Entre com a Operação: ");

				n2 = JOptionPane.showInputDialog("Digite o segundo número:");
				if (!n2.matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$")) {
					if (operacao.equals("+")) {
						resultado = cb.somar(Double.parseDouble(n1), Double.parseDouble(n2));
						cb.mostrarResultado((float) resultado, "Soma");

						int option = JOptionPane.showConfirmDialog(null, "Deseja repetir a operação?", "Aviso",
								JOptionPane.YES_NO_OPTION);

						if (option == 0) {
							i = 0;
						} else {
							i = 1;
						}
					} else if (operacao.equals("-")) {
						resultado = cb.subtrair(Double.parseDouble(n1), Double.parseDouble(n2));
						cb.mostrarResultado((float) resultado, "Subtração");
						int option = JOptionPane.showConfirmDialog(null, "Deseja repetir a operação?", "Aviso",
								JOptionPane.YES_NO_OPTION);

						if (option == 0) {
							i = 0;
						} else {
							i = 1;
						}
					} else if (operacao.equals("*")) {
						resultado = cb.multiplicar(Double.parseDouble(n1), Double.parseDouble(n2));
						cb.mostrarResultado((float) resultado, "Multiplicação");
						int option = JOptionPane.showConfirmDialog(null, "Deseja repetir a operação?", "Aviso",
								JOptionPane.YES_NO_OPTION);

						if (option == 0) {
							i = 0;
						} else {
							i = 1;
						}
					}

					else {
						resultado = cb.dividir(Double.parseDouble(n1), Double.parseDouble(n2));
						cb.mostrarResultado((float) resultado, "Divisão");
						int option = JOptionPane.showConfirmDialog(null, "Deseja repetir a operação?", "Aviso",
								JOptionPane.YES_NO_OPTION);

						if (option == 0) {
							i = 0;
						} else {
							i = 1;
						}

					}

				} else {
					JOptionPane.showMessageDialog(null, "Informe apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
				}

			} else {
				JOptionPane.showMessageDialog(null, "Informe apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
