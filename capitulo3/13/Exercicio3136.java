/*
http://www.caelum.com.br/apostila-java-orientacao-objetos/variaveis-primitivas-e-controle-de-fluxo/#3-13-exercicios-fixacao-de-sintaxe

3.13
6. (opcional) Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).

*/

class Exercicio3136{
	public static void main(String[] args) {
		int n1  = 1, n2 = 0, t = -1;

		System.out.print(n2+", "+n1);

		while(n1 < 100){
			t = n2 + n1;
			n1 = n2;
			n2 = t;

			System.out.print(", "+n1);
		}
		System.out.println();
	}
}