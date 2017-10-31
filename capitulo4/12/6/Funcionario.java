class Funcionario {
	String nome;
	String departamento;
	double salario;

	//4.12.6
	Data dataAdmissao;

	String rg;
	boolean estaNaEmpresa;

	void recebeAumento(double aumento) {
		this.salario+=aumento;
	}

	void demite() {
		estaNaEmpresa = false;
	}

	double calculaGanhoAnual() {
		return this.salario * 12.0;
	}

	//4.12.3
	void mostra() {
		System.out.println("\nNome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salário: "+this.salario);
		System.out.println("Ganho Anual: "+this.calculaGanhoAnual());
		
		//4.12.7
		System.out.println("Dia: "+this.dataAdmissao.dia);
		System.out.println("Mês: "+this.dataAdmissao.mes);
		System.out.println("Ano: "+this.dataAdmissao.ano);

		//4.12.9
		System.out.println("Data de Admissão: "+ this.dataAdmissao.formatada());

		System.out.println("RG: "+this.rg);
		System.out.println("Esta na Empresa? "+(estaNaEmpresa ? "Sim" : "Não"));
	}
}