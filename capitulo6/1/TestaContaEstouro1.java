class TestaContaEstouro1 {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 1000.0;
		conta.limite = 1000.0;
		conta.saca(50000); //saldo + limite é só 2000!!
	}
}