class TestaPorta {
	public static void main(String[] args) {
		Porta porta = new Porta();

		System.out.println("Porta esta "+(porta.estaAberta() ? "aberta":"fechada")+".");

		if(porta.estaAberta()) {
			porta.fecha();
			System.out.println("Porta foi fechada!");
		}else{
			porta.abre();
			System.out.println("Porta foi aberta!");
		}

		porta.fecha();
		porta.pinta("verde");
		System.out.println("Porta pintada de cor "+porta.cor);
	}
}