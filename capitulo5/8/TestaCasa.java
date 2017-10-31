class TestaCasa {
	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.pinta("azul");

		System.out.println("Casa cor "+casa.cor);

		casa.portas = new Porta[3];
		Porta porta1 = new Porta();
		casa.adicionaPorta(porta1);

		Porta porta2 = new Porta();
		casa.adicionaPorta(porta2);

		Porta porta3 = new Porta();
		casa.adicionaPorta(porta3);

		casa.portas[0].abre();
		casa.portas[1].fecha();
		casa.portas[2].abre();

		System.out.println(casa.quantasPortasEstaoAbertas()+" portas abertas!");

		casa.portas[0].fecha();
		casa.portas[1].fecha();
		casa.portas[2].fecha();

		System.out.println(casa.quantasPortasEstaoAbertas()+" portas abertas!");

		casa.portas[0].fecha();
		casa.portas[1].abre();
		casa.portas[2].fecha();

		System.out.println(casa.quantasPortasEstaoAbertas()+" portas abertas!");
	}
}