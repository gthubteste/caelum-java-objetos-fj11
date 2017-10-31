class Conta { 
	private int numero;
	private Cliente titular;
	private double saldo;
	private double limite;

	//construtor
	Conta() {
		System.out.println("Construindo uma conta.");
	}

	Conta(Cliente titular) {
		this.titular = titular;
	}

	Conta(int numero, Cliente titular) {
		this(titular);
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public int getNumero() {
		return this.numero;
	}
}