package heranca;

public class Motorista extends Funcionario{

	Motorista() {
		super();
	}
	
	Motorista(int numero, String nome){
		super(numero, nome);
		//System.out.println("Construtor Motorista.");
	}
	
	void dirige() {
		System.out.println("Motorista que dirige.");
	}
	
	@Override
	void trabalha() {
		System.out.println("Motorista que trabalha.");
	}

	public int getBonificacao() {
		return 60;
	}

}
