class TesteAcessoDireto {
	public static void main(String[] args) {
		Conta conta = new Conta();
		//não compila! você não pode acessar o atributo privado de outra classe
		conta.saldo = 1000;
	}
}