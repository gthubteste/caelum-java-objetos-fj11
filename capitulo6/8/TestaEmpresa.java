class TestaEmpresa {
	public static void main(String[] args) {
		//5.5.3
		// Empresa empresa = new Empresa();
		// empresa.funcionarios = new Funcionario[10];

		//6.7.7
		Empresa empresa = new Empresa(10);

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setSalario(1000);
		funcionario1.setNome("Funcionario "+funcionario1.getIdentificador());
		empresa.adiciona(funcionario1);

		Funcionario funcionario2 = new Funcionario("Nome do Funcionario pelo Construtor");
		funcionario2.setSalario(1700);
		empresa.adiciona(funcionario2);

		for(int i = 0; i < 8; i++){
			Funcionario funcionario = new Funcionario();
			funcionario.setSalario(1000 + i * 100);
			funcionario.setNome("Funcionario "+funcionario.getIdentificador());
			empresa.adiciona(funcionario);
		}

		Funcionario funcionario3 = new Funcionario();
		funcionario3.setSalario(2000);
		funcionario3.setNome("Funcionario "+funcionario3.getIdentificador());
		empresa.adiciona(funcionario3);

		//5.5.4
		empresa.mostraEmpregados();

		//Opcional 5.5.6
		boolean contemFuncionario = empresa.contem(funcionario2);
		System.out.println("\n\nContém funcionario2? " + (contemFuncionario ? "Sim" : "Não"));

		int posicao = funcionario2.getIdentificador()-1; //os funcionarios são armazenados em array
		empresa.getFuncionario((posicao)).mostra();
	}
}