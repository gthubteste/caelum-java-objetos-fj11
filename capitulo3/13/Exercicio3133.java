/*
http://www.caelum.com.br/apostila-java-orientacao-objetos/variaveis-primitivas-e-controle-de-fluxo/#3-13-exercicios-fixacao-de-sintaxe

3.13
3. Imprima todos os múltiplos de 3, entre 1 e 100.

*/

class Exercicio3133{
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++ ) {
			if( (i % 3) == 0){
				System.out.println(i);
			}
		}	
	}
}