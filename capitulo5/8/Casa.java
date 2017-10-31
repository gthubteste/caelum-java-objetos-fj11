class Casa {
	String cor;
	Porta[] portas;
	int totalDePortas;

	void pinta(String cor) {
		this.cor = cor;
	}

	int quantasPortasEstaoAbertas() {
		int portasAbertas = 0;

		for(Porta porta : portas){
			if(porta.estaAberta()){
				++portasAbertas;
			}
		}

		return portasAbertas;
	}

	void adicionaPorta(Porta porta){
		portas[totalDePortas++] = porta;
	}

	int totalDePortas(){
		return totalDePortas;
	}
}