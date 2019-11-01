package Exercicio;

import javax.swing.*;
import java.time.LocalDate;

public class TesteEnum {

	public static void main(String[] args) {
		ContaBancaria contaBancaria	 = new ContaBancaria("Jaqueline", "Rua 01", "123456", LocalDate.of(1993, 6,17));

		double valordeposito = Double.valueOf(JOptionPane.showInputDialog("Informe o valor do deposito para a Conta Bancaria do(a) " + contaBancaria.getNome()));
		contaBancaria.deposita(valordeposito);

		ClassificacaoClientes.POTENCIAL.isCompatible(contaBancaria);
		ClassificacaoClientes.MEDIO.isCompatible(contaBancaria);
		ClassificacaoClientes.BAIXO.isCompatible(contaBancaria);


		ContaBancaria contaBancaria1 = new ContaBancaria("Juliana ", "Rua B", "123456", LocalDate.of(2010, 11, 24));
		boolean cpf = contaBancaria.equals(contaBancaria1);
		System.out.println("CPF duplicado para a o Cliente: " + contaBancaria1.getNome());


	}

}
