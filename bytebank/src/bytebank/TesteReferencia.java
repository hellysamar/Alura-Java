package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta contaAlan = new Conta();
		contaAlan.saldo = 3550;
		
		System.out.println("O saldo atual da Conta de Alan � " + contaAlan.saldo);
		
		// Voce n�o est� Criando uma nova conta, apenas referenciando a novaConta na outraConta.
		Conta contaLeticia = new Conta();
		contaLeticia.saldo = 3000;
		contaAlan.saldo += 450;
	
		// Os valores impressos s�o os mesmos por estarem sendo referenciado, n�o est� sendo criado uma nova conta.
		System.out.println("O saldo atual da Conta de Alan � " + contaAlan.saldo);
		System.out.println("O saldo atual da Conta de Leticia � " + contaLeticia.saldo);
		
		if (contaLeticia == contaAlan) {
			System.out.println("s�o a mesma conta, sendo alocada em 2 lugares.");
		} else {
			System.out.println("s�o contas diferentes e individuais");
		}
		
		boolean SucessoTransferencia = contaAlan.transfere(300, contaLeticia);
		if (SucessoTransferencia) {
			System.out.println("Transferencia realizada com Sucesso!");
		} else {
			System.out.println("Transferencia cancelada, voc� n�o tem limite suficiente!");			
		}
		System.out.println("O saldo atual da Conta de Alan � " + contaAlan.saldo);
		System.out.println("O saldo atual da Conta de Leticia � " + contaLeticia.saldo);
	}
}
