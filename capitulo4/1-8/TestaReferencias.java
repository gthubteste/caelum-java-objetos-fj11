class TestaReferencias{
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.deposita(100);

		Conta c2 = c1; //linha importante!
		c2.deposita(200);

		System.out.println(c1.saldo);
		System.out.println(c2.saldo);

		//Outra situacao
		Conta cc1 = new Conta();
		cc1.cliente = "Duke";
		cc1.saldo = 227;

		Conta cc2 = new Conta();
		cc2.cliente = "Duke";
		cc2.saldo = 227;

		if(cc1 ==cc2 ){
			System.out.println("Contas iguais");
		}
	}
}