class TestaConstrutorComDoisArgumentos {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Carlos");

		Conta conta = new Conta(123456789, cliente);
		System.out.println("Conta - Cliente: "+conta.getTitular().getNome()+" Número: "+conta.getNumero());
	}
}