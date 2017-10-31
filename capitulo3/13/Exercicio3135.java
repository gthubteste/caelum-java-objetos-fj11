/*
http://www.caelum.com.br/apostila-java-orientacao-objetos/variaveis-primitivas-e-controle-de-fluxo/#3-13-exercicios-fixacao-de-sintaxe

3.13
5. No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos, até 20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas completamente erradas. Por quê?

Mude de int para long para ver alguma mudança.

*/

class Exercicio3135{
	public static void main(String[] args) {
		long fatorial = 1;
		for (int n = 1; n <= 40; n++ ) {
			System.out.println("O fatorial de "+n+" é ("+(n-1)+"!) * "+n+" = "+fatorial);
			fatorial *= n;
		}
	}
}