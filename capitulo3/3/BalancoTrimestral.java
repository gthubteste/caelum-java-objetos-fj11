class BalancoTrimestral{
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gasosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gasosMarco;
		int mediaMensal = gastosTrimestre / 3;

		System.out.println(gastosTrimestre);
		System.out.println("Valor da média mensal = "+mediaMensal);

		System.out.println("\n# if, if-else");

		int idade = 15;
		boolean amigoDoDono = true;
		// if(idade < 18 && amigoDoDono == false){
		if(idade < 18 && !amigoDoDono){
			System.out.println("Não pode entrar");
		}else{
			System.out.println("Pode entrar");
		}

		int mes = 1;
		if(mes == 1){
			System.out.println("Você deveria estar de férias\n");
		}

		System.out.println("\n# while");

		while(idade < 18){
			System.out.println(idade);
			idade = idade + 1;
		}

		System.out.println("\n");

		int i = 0;
		while(i < 10){
			System.out.println(i);
			i = i + 1;
		}

		System.out.println("\n# for");

		for (int j = 0; j < 10; j = j + 1) {
			System.out.println("olá!");
		}

		for(int l = 0; l < 100; l++){
			if(l > 50 && l < 60){
				continue;
			}
			System.out.println(l);
		}

		int divisaoPorZeroInteiro = 10 / 0;
		int divisaoPorZeroDouble = 10 / (int) 0.0;
	}
}