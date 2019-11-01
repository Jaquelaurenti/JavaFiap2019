package Tratamentos;

public class TesteErros {

	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("inicio do main");

	}
	private static void metodo1() {
		System.out.println("inicio do metodo 1");
		metodo2();
		System.out.println("inicio do metodo 2");
		
	}

	private static void metodo2() {
		System.out.println("inicio do main");
		ContaCorrente cc = new ContaCorrente();
		
		try {
			for (int i = 0; i <= 15; i++) {
				cc.deposita(i + 1000);
				System.out.println(cc.getSaldo());
				if(i == 5) {
					cc = null;
				}
			}
		}catch (NullPointerException e) {
			System.out.println("erro: " + e);
		}
		
		for (int i = 0; i <= 15; i++) {
			try {
				cc.deposita(i + 1000);
				System.out.println(cc.getSaldo());
				if(i == 5) {
					cc = null;
				}
			}catch (NullPointerException e) {
				System.out.println("erro: " + e);
			}
		}
	
		
		System.out.println("Fim do metodo 2");
	}

}
