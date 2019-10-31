package heranca;

public class TesteFuncionario {
	public static void main(String[] args) {
//		Funcionario f1 = new Funcionario();
//		f1.setNome("Joao");
//		f1.setNumero(123);
//		System.out.println(f1.getNome());
//		System.out.println(f1.getNumero());
//		
//		f1.trabalha();
//		
//		Motorista m1 = new Motorista();
//		m1.setNome("Luis");
//		m1.setNumero(456);
//		System.out.println(m1.getNome());
//		System.out.println(m1.getNumero());
//		
//		m1.trabalha();
//		m1.dirige();
//		
//		Funcionario f2 = new Funcionario (789, "Maria");
//		System.out.println(f2.getNome());
//		
//		Motorista m2 = new Motorista(444, "Zé");
//		System.out.println(m2.getNome());

		Funcionario f1 = new Funcionario();
		f1.setNome("Joao");
		f1.setNumero(123);

		Funcionario[] arrayFunc = new Funcionario[3];
		arrayFunc[0] = f1;
		arrayFunc[1] = new Funcionario(555, "Pepe");
		arrayFunc[2] = new Motorista(666, "Satã");
		
		System.out.println(arrayFunc[0].getNome());
		System.out.println(arrayFunc[1].getNome());
		System.out.println(arrayFunc[2].getNome());

		arrayFunc[1].trabalha();
		arrayFunc[2].trabalha();
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(f1);
		cb.registra(arrayFunc[2]);
		
		System.out.println(cb.getTotalBonificacao());
		
	}
}
