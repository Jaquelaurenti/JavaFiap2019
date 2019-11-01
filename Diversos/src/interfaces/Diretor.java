package interfaces;

public class Diretor extends Funcionario implements Autenticavel {

	private String senha = "123";
	
	Diretor(int numero, String nome){
		this.numero = numero;
		this.nome = nome;
	}
	
	@Override
	public int getBonificacao() {
		return 60;
	}
	
	@Override
	public boolean autentica(String senha) {
		if (this.senha != senha) {
			return false;
			}
		else
			return true;
	}

}
