class Conta {
	int numero;
	Cliente titular;
	
	//Para TestaContaEstouro1, TestaContaEstouro2 e TestaContaEstouro3 
	//double saldo;
	//double limite;

	private double saldo;
	private double limite;

	//Ate TesteAcessoDireto
	// void saca(double valor){
	// 	this.saldo = this.saldo - valor;
	// }

	public void saca(double valor){
		//posso sacar até o saldo+limite
		if(valor > this.saldo + this.limite) {
			System.out.println("Não posso sacar fora do limite!");
		} else {
			this.saldo = this.saldo - valor;
		}
	}
}