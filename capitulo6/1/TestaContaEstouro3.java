class TestaContaEstouro3 {
	public static void main(String[] args) {
		//a Conta
		Conta conta = new Conta();
		conta.limite = 100;
		conta.saldo = 100;

		//quero mudar o saldo para -200
		double novoSaldo = -200;

		//testa se o novoSaldo ultrapassa o limite da conta
		if(novoSaldo < -conta.limite) {
			System.out.println("Não posso mudar para esse saldo");
		} else {
			conta.saldo = novoSaldo;
		}		
	}
}