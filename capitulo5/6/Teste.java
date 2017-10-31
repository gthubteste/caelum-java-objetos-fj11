//$ java Teste argumento 1 outro maisoutro

class Teste {
	public static void main(String[] args) {
		for(String argumento : args){
			System.out.println(argumento);
		}
	}
}