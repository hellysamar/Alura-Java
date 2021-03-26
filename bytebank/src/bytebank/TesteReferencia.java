package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta contaAlan = new Conta();
		contaAlan.saldo = 3550;
		
		System.out.println("O saldo atual da Conta de Alan é " + contaAlan.saldo);
		
		// Voce não está¡ Criando uma nova conta, apenas referenciando a novaConta na outraConta.
		Conta contaLeticia = new Conta();
		contaLeticia.saldo = 3000;
		contaAlan.saldo += 450;
	
		// Os valores impressos são os mesmos por estarem sendo referenciado, não está¡ sendo criado uma nova conta.
		System.out.println("O saldo atual da Conta de Alan é " + contaAlan.saldo);
		System.out.println("O saldo atual da Conta de Leticia é " + contaLeticia.saldo);
		
		if (contaLeticia == contaAlan) {
			System.out.println("são a mesma conta, sendo alocada em 2 lugares.");
		} else {
			System.out.println("são contas diferentes e individuais");
		}
		
		boolean SucessoTransferencia = contaAlan.transfere(300, contaLeticia);
		if (SucessoTransferencia) {
			System.out.println("Transferencia realizada com Sucesso!");
		} else {
			System.out.println("Transferencia cancelada, você não tem limite suficiente!");			
		}
		System.out.println("O saldo atual da Conta de Alan é " + contaAlan.saldo);
		System.out.println("O saldo atual da Conta de Leticia é " + contaLeticia.saldo);
	}
}
