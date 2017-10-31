/** 6.9.1 
 * o código não compila porque a variável x não é estática
 * para ser acessada no contexto do método main, que é estático.
 */	
class Teste {
	int x = 37;
	public static void main(String[] args) {
		System.out.println(x);
	}
}