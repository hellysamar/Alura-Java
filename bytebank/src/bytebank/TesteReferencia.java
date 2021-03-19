package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta novaConta = new Conta();
		novaConta.saldo = 3550;
		
		System.out.println("O saldo da conta é de R$ " + novaConta.saldo);
		
		// Voce não está Criando uma nova conta, apenas referenciando a novaConta na outraConta.
		Conta outraConta = novaConta;
		outraConta.saldo += 450;
	
		// Os valores impressos são os mesmos por estarem sendo referenciado, não está sendo criado uma nova conta.
		System.out.println("O saldo da conta1 é " + outraConta.saldo);
		System.out.println("O saldo da conta2 é " + novaConta.saldo);
		
		if (outraConta == novaConta) {
			System.out.println("são a mesma conta, sendo alocada em 2 lugares.");
		} else {
			System.out.println("são contas diferentes e individuais");
		}
		
	}
}
