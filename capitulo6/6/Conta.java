class Conta {
	// private int totalDeContas;
	private static int totalDeContas;

	Conta() {
		// this.totalDeContas = this.totalDeContas + 1;
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	// public int getTotalDeContas() {
	// 	return Conta.totalDeContas;
	// }

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}