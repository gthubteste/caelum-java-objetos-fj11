class TestaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Joãozinho";
		pessoa.idade = 10;

		System.out.println("Nome: "+pessoa.nome);
		System.out.println("Idade: "+pessoa.idade);
		pessoa.fazAniversario();
		System.out.println("Parabéns, "+pessoa.nome+" pelos seus "+pessoa.idade+" anos!");

		pessoa.fazAniversario();
		System.out.println("Parabéns, "+pessoa.nome+" pelos seus "+pessoa.idade+" anos!");
	}
}