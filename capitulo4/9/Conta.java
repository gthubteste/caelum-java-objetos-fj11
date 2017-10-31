class Conta{
	int numero;
	double saldo;
	double limite;
	Cliente titular;

	boolean saca(double valor){
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