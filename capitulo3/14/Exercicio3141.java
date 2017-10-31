/*
http://www.caelum.com.br/apostila-java-orientacao-objetos/variaveis-primitivas-e-controle-de-fluxo/#3-14-desafios-fibonacci

3.14
1. Faça o exercício da série de Fibonacci usando apenas duas variáveis.

*/

class Exercicio3141{
	public static void main(String[] args) {
		int n1  = 1, n2 = 0;

		System.out.print(n2+", "+n1);

		while(n1 < 100){
			n1 = n1 + n2;
			n2 = n1 - n2;

			System.out.print(", "+n1);
		}
		System.out.println();
	}
}