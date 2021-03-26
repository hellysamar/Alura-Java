 package bytebank;

public class TesteMetodo {

	public static void main(String[] args) {
		
		Conta contaDoHelly = new Conta();
		contaDoHelly.saldo = 1000;
		contaDoHelly.deposita(600);
		System.out.println("seu saldo é de R$ " + contaDoHelly.saldo);
		
		boolean conseguiuSacar = contaDoHelly.saca(800);
		System.out.println("seu saldo é de R$ " + contaDoHelly.saldo);
		
		if (conseguiuSacar) {
			System.out.println("Você conseguiu sacar");
		} else {
			System.out.println("Não foi possivel sacar");			
		}

		boolean conseguiuSacar1 = contaDoHelly.saca(800.1);
		System.out.println("seu saldo é de R$ " + contaDoHelly.saldo);
		
		if (conseguiuSacar1) {
			System.out.println("Você conseguiu sacar");
		} else {
			System.out.println("Não foi possivel sacar");			
		}
	}
}
