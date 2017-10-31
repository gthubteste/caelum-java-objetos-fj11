class Conta{
	int numero = 1234;
	double saldo = 1000;
	double limite = 1000;
	String cliente;

	boolean saca(double valor){
		//4.6 métodos com retorno, saca com teste de saldo			
		if(this.saldo < valor){
			return false;
		}else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double valor){
		this.saldo += valor;
	}

	boolean transferePara(Conta destino, double valor){
		boolean retirou = this.saca(valor);
		if(retirou == false){
			//não deu pra sacar!
			return false;
		}else{
			destino.deposita(valor);
			return true;
		}
	}
}