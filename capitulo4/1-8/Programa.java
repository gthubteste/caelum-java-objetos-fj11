class Programa {
	public static void main(String[] args) {
		Conta conta;
		conta = new Conta();

		conta.cliente = "Duke";
		conta.saldo = 1000.0;

		System.out.println("Saldo atual: "+conta.saldo);
	}
}