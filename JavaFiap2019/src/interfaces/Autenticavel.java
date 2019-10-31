package interfaces;

public interface Autenticavel {
	boolean autentica(String senha);
	
	//Método não obrigatório -> default
	default int metodoDefault(int valor) {
		return 0;
	}
}
