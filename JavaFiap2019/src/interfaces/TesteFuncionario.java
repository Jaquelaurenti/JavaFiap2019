package interfaces;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Joao");
		f1.setNumero(123);

		Funcionario[] arrayFunc = new Funcionario[4];
		arrayFunc[0] = f1;
		arrayFunc[1] = new Funcionario(555, "Pepe");
		arrayFunc[2] = new Motorista(666, "Satã");
		arrayFunc[3] = new Diretor(777, "Diretor");
		
		System.out.println(arrayFunc[0].getNome());
		System.out.println(arrayFunc[1].getNome());
		System.out.println(arrayFunc[2].getNome());
		System.out.println(arrayFunc[3].getNome());

//		arrayFunc[1].trabalha();
//		arrayFunc[2].trabalha();
		
		System.out.println("Autentica : " + ((Autenticavel)arrayFunc[3]).autentica("222"));
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(f1);
		cb.registra(arrayFunc[2]);
		
		System.out.println("Total bonificação : " + cb.getTotalBonificacao());
		
	}
}
