package sintaxe;

public class TesteConversãoEOutrosTipos {

	public static void main(String[] args) {
		
		double salario = 1250.50;
		// int salario2 = salario; o Java não complica dessa forma, sem que afirmemos que sabemos o que acontecerá!
		int salarioI = (int) salario; // aqui coloquei o (int) antes de salário, mostrando ao Java que estou ciente do que acontecerá.
		
		System.out.println(salarioI);
		
		long numeroGrande = 32432423523L;
		short valorPequeno = 2131;
		byte b = 127;
		float pontoFlutuante = 3.14f;
	}
}
