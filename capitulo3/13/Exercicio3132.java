/*
http://www.caelum.com.br/apostila-java-orientacao-objetos/variaveis-primitivas-e-controle-de-fluxo/#3-13-exercicios-fixacao-de-sintaxe

3.13
2. Imprima a soma de 1 até 1000.

*/

class Exercicio3132{
	public static void main(String[] args) {
		int somaUmAMil = 0;
		for (int i = 1; i <= 1000; i++ ) {
			somaUmAMil+=i;
		}	
		System.out.println(somaUmAMil);
	}
}