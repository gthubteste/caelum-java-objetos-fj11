class TestaCasa {
	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.pinta("azul");

		System.out.println("Casa cor "+casa.cor);

		Porta porta1 = new Porta();
		casa.porta1 = porta1;

		Porta porta2 = new Porta();
		casa.porta2 = porta2;

		Porta porta3 = new Porta();
		casa.porta3 = porta3;

		casa.porta1.abre();
		casa.porta2.fecha();
		casa.porta3.abre();

		System.out.println(casa.quantasPortasEstaoAbertas()+" portas abertas!");

		casa.porta1.fecha();
		casa.porta2.fecha();
		casa.porta3.fecha();

		System.out.println(casa.quantasPortasEstaoAbertas()+" portas abertas!");

		casa.porta1.fecha();
		casa.porta2.abre();
		casa.porta3.fecha();

		System.out.println(casa.quantasPortasEstaoAbertas()+" portas abertas!");
	}
}