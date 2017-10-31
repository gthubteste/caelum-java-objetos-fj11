class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;

	void abre() {
		aberta = true;
	}

	void fecha() {
		aberta = false;
	}

	void pinta(String cor) {
		this.cor = cor;
	}

	boolean estaAberta() {
		return this.aberta;
	}
}