/*
http://www.caelum.com.br/apostila-java-orientacao-objetos/variaveis-primitivas-e-controle-de-fluxo/#3-13-exercicios-fixacao-de-sintaxe

3.13
8. (opcional) Imprima a seguinte tabela, usando fors encadeados:

1
2 4
3 6 9
4 8 12 16
n n*2 n*3 .... n*n

*/

class Exercicio3138{
	public static void main(String[] args) {
		int k = 4;
		String s = "n";
		for(int i = 1; i <= k; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i*j+"\t");
			}
			System.out.println();

			if(i < k){
				s += "\tn*"+(i+1);	
			} else{
				s += " .... n*n";	
			}
		}
		System.out.println(s);
	}
}