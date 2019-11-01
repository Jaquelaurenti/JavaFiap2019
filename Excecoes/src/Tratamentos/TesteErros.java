package Tratamentos;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class TesteErros {

	public static void main (String[] args) {
		System.out.println("Inicio main");
		try {
			metodo1();
		} catch (NullPointerException e) {
			System.out.println("Teve um erro:" + e);
		}
		System.out.println("Fim main");
	}

	static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fim metodo1");
	}

	static void metodo2() {
		System.out.println("Inicio metodo 2");

		ContaCorrente cc = new ContaCorrente("Cliente 1", "Rua A", "123", LocalDate.of(2019, 10, 31));

		metodo3(cc);
		/*
			for (int i = 0; i <= 15; i++) {
				cc.deposita(i + 1000);
				System.out.println(cc.getSaldo());
				if (i ==5) {
					cc = null;
				}
			}
		System.out.println("Fim metodo2");
		 */
	}

	static void metodo3(ContaCorrente cc) {
		double valueDeposita = Double.valueOf(JOptionPane.showInputDialog("Valor dep�sito: "));
		cc.deposita(valueDeposita);
		System.out.println("Valor final: ");
		System.out.println(cc.getSaldo());

		ContaCorrente c2 = new ContaCorrente("Cliente 2", "Rua B", "456", LocalDate.of(2010, 11, 24));
		boolean cpf = cc.equals(c2);
		System.out.println("Cpf � igual: " + cpf);

		double valueSaca = Double.valueOf(JOptionPane.showInputDialog("Valor saque: "));
		try {
			cc.saca(valueSaca);
		} catch (SaldoInsuficiente e) {
		
			e.printStackTrace();
		}
		System.out.println("Valor final 2: " + cc.getSaldo());
		System.out.println("Data nascimento: " + cc.getDataNascimento());
	}
}
