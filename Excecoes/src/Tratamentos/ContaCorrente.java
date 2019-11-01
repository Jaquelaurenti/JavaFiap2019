package Tratamentos;

public class ContaCorrente {
	protected double saldo;
	
	public void deposita(double valor){
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void saca(double valor) throws SaldoInsuficiente{
		this.saldo = saldo-valor;
		
	}
}
