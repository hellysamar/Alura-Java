package sintaxe;

//import com.sun.java_cup.internal.runtime.Scanner;

public class AtividadeAliquotaComIfs {

	public static void main(String[] args) {
		
		//Scanner nome = new Scanner (System.in);
		
		//System.out.println("Digite seu nome:");
		
		//String fulano = nome;
		double salario = 33000.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("IR é de 7.5% e pode deduzir na declaração o calr de R$142");
		} if (salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("IR é de 15% e pode deduzir na declaração o calr de R$350");
		} if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("IR é de 22.5% e pode deduzir na declaração o calr de R$636");
		} else {
			System.out.println("valor não se enquadra na faixa.");
		}
	}
}
