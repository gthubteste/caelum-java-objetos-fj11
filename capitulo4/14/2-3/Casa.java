class Casa {
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;

	void pinta(String cor) {
		this.cor = cor;
	}

	int quantasPortasEstaoAbertas() {
		int portasAbertas = 0;
		
		if(porta1.estaAberta()) portasAbertas++;
		if(porta2.estaAberta()) portasAbertas++;
		if(porta3.estaAberta()) portasAbertas++;

		return portasAbertas;
	}
}