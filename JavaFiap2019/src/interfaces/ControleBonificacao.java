package interfaces;

public class ControleBonificacao {
	private int totalBonificacao = 0;
	
	void registra(Funcionario funcionario) {
		totalBonificacao += funcionario.getBonificacao();
	}

	public int getTotalBonificacao() {
		return totalBonificacao;
	}
}
