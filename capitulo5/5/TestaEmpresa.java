class TestaEmpresa {
	public static void main(String[] args) {
		//5.5.3
		Empresa empresa = new Empresa();
		empresa.funcionarios = new Funcionario[10];

		Funcionario funcionario1 = new Funcionario();
		funcionario1.salario = 1000;
		empresa.adiciona(funcionario1);

		Funcionario funcionario2 = new Funcionario();
		funcionario2.salario = 1700;
		empresa.adiciona(funcionario2);

		for(int i = 0; i < 8; i++){
			Funcionario funcionario = new Funcionario();
			funcionario.salario = 1000 + i * 100;
			empresa.adiciona(funcionario);
		}

		Funcionario funcionario3 = new Funcionario();
		funcionario3.salario = 2000;
		empresa.adiciona(funcionario3);

		//5.5.4
		empresa.mostraEmpregados();

		//Opcional 5.5.6
		boolean contemFuncionario = empresa.contem(funcionario2);
		System.out.println("\n\nContém funcionario2? " + (contemFuncionario ? "Sim" : "Não"));
	}
}