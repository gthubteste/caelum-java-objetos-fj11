//6.8.9
class PessoaFisica {
	private String cpf;

	PessoaFisica(String cpf) {
		if(!validaCpf(cpf)) {
			System.out.println("CPF " + cpf  + " inválido!");
		} else {
			this.cpf = cpf;
		}
	}

	private boolean validaCpf(String cpf) {
		return cpf.length() == 11;
	}
}