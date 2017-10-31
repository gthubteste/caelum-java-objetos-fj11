class Empresa {
	//5.5.1
	Funcionario[] funcionarios;
	String cnpj;
	int countFuncionarios = 0;

	//5.5.2
	void adiciona(Funcionario funcionario){

		//p/ atender 5.5.5, evitar NullPointer ao chamar funcionario.mostra() em mostraEmpregados()
		Data dataAdmissao = new Data();
		dataAdmissao.dia = 19;
		dataAdmissao.mes = 3;
		dataAdmissao.ano = 2015;

		funcionario.dataAdmissao = dataAdmissao;
		
		//Nada bonito, mas p/ informacoes mais pertinentes ao funcionario.mostra() e usar contem(Funcionario)
		funcionario.nome = "Funcionario "+countFuncionarios;
		funcionario.estaNaEmpresa = true;
		//

		//Opcional 5.5.3
		// if(countFuncionarios < funcionarios.length){
		// 	movido para o final do metodo apos Opcional 5.5.7
		// 	funcionarios[countFuncionarios++] = funcionario;	
		// }else{
		// 	System.out.println("Não há mais vagas para funcionarios.");
		// }

		//Opcional 5.5.7
		if(countFuncionarios <= funcionarios.length){
			expandirEmpresa(this);
		}

		funcionarios[countFuncionarios++] = funcionario;	
		//
	}

	//5.5.4
	void mostraEmpregados() {
		for(int i = 0; i < countFuncionarios; i++){
			System.out.println("\n\nFuncionário na posição: "+i);
			//System.out.println("Salário: "+ funcionarios[i].salario);

			//5.5.5				
			funcionarios[i].mostra();
		}
	}

	//Opcional 5.5.6
	boolean contem(Funcionario funcionario){
		for(int i = 0; i < countFuncionarios; i++){
			if(funcionario.nome.equals(funcionarios[i].nome) 
				&& funcionario.salario == funcionarios[i].salario
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
}