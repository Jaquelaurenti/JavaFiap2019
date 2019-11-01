package Exercicio;

import java.time.LocalDate;

public class ContaBancaria {
	protected double saldo;

	private String nome;
	private String endereco;
	private String cpf;
	private LocalDate dataNascimento;

	public ContaBancaria(String nome, String endereco, String cpf, LocalDate dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public boolean equals(Object obj) {
		ContaBancaria conta = (ContaBancaria) obj;
		return (conta.cpf.equals(this.cpf));
	}

	public void deposita(double valor){
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public String getNome() {
		return nome;
	}
	public void saca(double valor) throws SaldoInsuficiente {
		if (this.saldo < valor) {
			throw new SaldoInsuficiente("Saldo insuficiente para saque.");
		}
		this.saldo = saldo - valor;
	}
}
