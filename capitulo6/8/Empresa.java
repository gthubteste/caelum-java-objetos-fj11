class Empresa {
	//5.5.1
	// Funcionario[] funcionarios;	
	//6.7.6
	private Funcionario[] funcionarios;
	String cnpj;
	int countFuncionarios = 0;

	//6.7.7
	Empresa(int quantidadeInicialDeFuncionarios) {
		this.funcionarios = new Funcionario[quantidadeInicialDeFuncionarios];
	}

	//5.5.2
	void adiciona(Funcionario funcionario){

		Data dataAdmissao = new Data();
		dataAdmissao.dia = 19;
		dataAdmissao.mes = 3;
		dataAdmissao.ano = 2015;

		// funcionario.dataAdmissao = dataAdmissao;
		funcionario.setDataAdmissao(dataAdmissao);
		funcionario.setEstaNaEmpresa(true);
		if(countFuncionarios <= funcionarios.length){
			expandirEmpresa(this);
		}

		funcionarios[countFuncionarios++] = funcionario;	
	}

	//5.5.4
	void mostraEmpregados() {
		for(int i = 0; i < countFuncionarios; i++){
			System.out.println("\n\nFuncionário na posição: "+(i+1));
			//System.out.println("Salário: "+ funcionarios[i].salario);

			//5.5.5				
			getFuncionario(i).mostra();
		}
	}

	//

	//Opcional 5.5.6
	boolean contem(Funcionario funcionario){
		for(int i = 0; i < countFuncionarios; i++){
			if(funcionario.getNome().equals(funcionarios[i].getNome()) 
				&& funcionario.getSalario() == funcionarios[i].getSalario()
				){
				return true;
			}
		}
		return false;
	}

	//Opcional 5.5.7
	void expandirEmpresa(Empresa empresa){
		int totalFuncionarios = empresa.funcionarios.length;
		Funcionario[] funcionariosTemp = new Funcionario[totalFuncionarios*2];
		
		for (int i = 0; i < totalFuncionarios; i++) {
			funcionariosTemp[i] = empresa.funcionarios[i];
		}

		empresa.funcionarios = funcionariosTemp;
	}

	//6.7.6
	public Funcionario getFuncionario(int posicao) {
		return this.funcionarios[posicao];
	}
}