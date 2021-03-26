package bytebank;

public class Conta {

	double saldo; // -----------------------Atributo
	int agencia; // ------------------------Atributo
	int numeroConta; // --------------------Atributo
	String titular; // ---------------------Atributo
	
	void deposita(double valor) { // -------Método
		this.saldo = this.saldo + valor; 
	}
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false; // ---------------Retorno do Método
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		
	}
}
