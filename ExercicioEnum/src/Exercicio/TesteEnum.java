package Exercicio;

import javax.swing.*;
import java.time.LocalDate;

public class TesteEnum {

	public static void main(String[] args) {
		ContaBancaria contaBancaria	 = new ContaBancaria("Jaqueline", "Rua 01", "123456", LocalDate.of(1993, 6,17));

		double valordeposito = Double.valueOf(JOptionPane.showInputDialog("Informe o valor do deposito para a Conta Bancaria do(a) " + contaBancaria.getNome()));
		contaBancaria.deposita(valordeposito);

		if(!ClassificacaoClientes.POTENCIAL.validaFaixaFinal(contaBancaria)){
            if(ClassificacaoClientes.POTENCIAL.isCompatible(contaBancaria)){
                System.out.println("Cliente POTENCIAL" + "Nome Cliente: " + contaBancaria.getNome());
            }
            if(ClassificacaoClientes.MEDIO.isCompatible(contaBancaria)){
                System.out.println("Cliente MEDIO" + "Nome Cliente: " + contaBancaria.getNome());
            }
            if(ClassificacaoClientes.BAIXO.isCompatible(contaBancaria)){
                System.out.println("Cliente BAIXO" + "Nome Cliente: " + contaBancaria.getNome());
            }
        }
		else{
            System.out.println("Classificacao fora do Range de Faixas estipulados para a conta " + contaBancaria.getNome());
        }




		/*ContaBancaria contaBancaria1 = new ContaBancaria("Juliana ", "Rua B", "123456", LocalDate.of(2010, 11, 24));
		boolean cpf = contaBancaria.equals(contaBancaria1);
		System.out.println("CPF duplicado para a o Cliente: " + contaBancaria1.getNome());*/


	}

}
