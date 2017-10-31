class TestaConstrutorComArgumento {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Carlos");

		Conta conta = new Conta(cliente);
		System.out.println(conta.getTitular().getNome());
	}
}