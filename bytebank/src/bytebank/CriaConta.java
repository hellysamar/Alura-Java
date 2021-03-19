package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 3000;
		primeiraConta.titular = "Altair";
		
		Conta segundaConta = new Conta();
		segundaConta.titular = "Lucas";
		segundaConta.saldo = 100;
		segundaConta.saldo += 10;
		
		System.out.println(primeiraConta.titular + " tem em sua conta R$ " + primeiraConta.saldo);
		System.out.println(segundaConta.titular + " tem em sua conta R$ " + segundaConta.saldo);
		System.out.println(primeiraConta.numeroConta);
	}
}
