class Teste{
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		Cliente cliente = new Cliente();
		conta.titular = cliente;
		
		Cliente clienteDaConta = conta.titular;
		clienteDaConta.nome = "Duke";
		// ou
		conta.titular.nome = "Duke";
	}
}