class Funcionario {
	//6.7.5
	private static int controleIdentificador;
	private int identificador;
	//
	private String nome;
	private String departamento;
	private double salario;

	//4.12.6
	private Data dataAdmissao;

	private String rg;
	private boolean estaNaEmpresa;

	Funcionario(){
		this(null);
	}

	Funcionario(String nome){
		this.nome = nome;
		//6.7.5
		this.identificador = ++Funcionario.controleIdentificador;
		//
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataAdmissao() {
		return this.dataAdmissao;
	}

	public void setDataAdmissao(Data dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean isEstaNaEmpresa() {
		return this.estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}

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
		System.out.println("Identificador: "+this.getIdentificador());
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