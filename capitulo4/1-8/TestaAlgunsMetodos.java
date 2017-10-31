class TestaAlgunsMetodos{
	public static void main(String[] args) {
		//criando a conta
		Conta conta;
		conta = new Conta();

		//alterando os valores da conta
		conta.cliente = "Duke";
		conta.saldo = 1000.0;

		//saca 200
		conta.saca(200);

		//deposita 500
		conta.deposita(500);

		System.out.println(conta.saldo);

		//Exemplo de uso saca com retorno
		conta.saldo = 1000;
		boolean consegui = conta.saca(2000);
		if(consegui){
			System.out.println("consegui sacar");
		}else{
			System.out.println("Não consegui sacar");
		}

		//Exemplo de uso saca com retorno sem variável temporária
		conta.saldo = 1000;
		if(conta.saca(2000)){
			System.out.println("consegui sacar");
		}else{
			System.out.println("Não consegui sacar");
		}
	}
}