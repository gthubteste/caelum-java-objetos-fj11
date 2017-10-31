class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataAdmissao;
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

	//4.3
	void mostra() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salário: "+this.salario);
		System.out.println("Ganho Anual: "+this.calculaGanhoAnual());
		System.out.println("Data Admissão: "+this.dataAdmissao);
		System.out.println("RG: "+this.rg);
		System.out.println("Esta na Empresa? "+(estaNaEmpresa ? "Sim" : "Não"));
	}
}