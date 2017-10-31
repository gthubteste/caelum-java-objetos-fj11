class TestaFuncionario {
	public static void main(String[] args) {
		
		//4.12.1-3
		Funcionario funcionario = new Funcionario();

		funcionario.nome = "Hugo";
		funcionario.departamento = "Contabilidade";
		funcionario.salario = 100;
		funcionario.rg = "123456789";
		funcionario.estaNaEmpresa = true;

		System.out.println("salario atual: "+funcionario.salario);
		System.out.println("ganho anual: "+funcionario.calculaGanhoAnual());

		double aumento = 50;
		System.out.println("recebendo aumento de "+aumento);
		funcionario.recebeAumento(aumento);
		System.out.println("salario após aumento: "+funcionario.salario);
		System.out.println("ganho anual após aumento: "+funcionario.calculaGanhoAnual()+"\n");
		
		//4.12.6
		Data data = new Data();
		funcionario.dataAdmissao = data;

		//4.12.7
		funcionario.mostra();
		
		data.dia = 18;
		data.mes = 3;
		data.ano = 2015;

		funcionario.mostra();

		//4.12.4
		Funcionario f1 = new Funcionario();
		f1.nome = "Danilo";
		f1.salario = 100;

		Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario = 100;

		System.out.print("\nf1 e f2 são? ");
		if(f1 == f2) {
			System.out.print("iguais\n");
		} else {
			System.out.print("diferentes\n");
		}

		//4.12.5
		Funcionario f3 = new Funcionario();
		f3.nome = "Hugo";
		f3.salario = 100;

		Funcionario f4 = f3;

		System.out.print("\nf3 e f4 são? ");
		if(f3 == f4) {
			System.out.print("iguais\n");
		} else {
			System.out.print("diferentes\n");
		}

		//4.12.8
		//Funcionario.salario = 1234;
		//Funcionario.calculaGanhoAnual();
	}
}