class TestaCarro {
	public static void main(String[] args) {
		Carro carro;
		carro = new Carro();
		carro.cor = "Verde";
		carro.modelo = "Fusca";
		carro.velocidadeAtual = 0;
		carro.velocidadeMaxima = 80;

		//liga o carro
		carro.liga();

		//acelera o carro
		carro.acelera(20);
		System.out.println(carro.velocidadeAtual);
	}
}