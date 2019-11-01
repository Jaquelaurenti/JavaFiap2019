package Exercicio;

public enum ClassificacaoClientes {
	
	POTENCIAL(400001,500000),
	MEDIO(200001,400000),
	BAIXO(0,200000);
	
	private double faixaInicial;
	private double faixaFinal;
	
	ClassificacaoClientes(double faixaInicial, double faixaFinal){
		this.faixaInicial = faixaInicial;
		this.faixaFinal = faixaFinal;
	}
	
	public boolean isCompatible(ContaBancaria conta){
    	if (conta.getSaldo() >= faixaInicial && conta.getSaldo() <= faixaFinal){
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}