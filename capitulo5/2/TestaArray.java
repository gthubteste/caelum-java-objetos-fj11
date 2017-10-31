class TestaArray {
	public static void main(String[] args) {
		Conta[] contas;
		contas = new Conta[10];

		//System.out.println(contas[0].saldo);
		Conta conta = new Conta();
		conta.saldo = 1000.0;
		contas[0] = conta;

		contas[1] = new Conta();
		contas[1].saldo = 3200.0;

		System.out.println(contas[0].saldo);
		System.out.println(contas[1].saldo);
	}
}