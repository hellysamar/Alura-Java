package sintaxe;

public class AtividadeComandoSwitch {

	public static void main(String[] args) {
		
		int mes = 91;
		
		switch (mes) {
			case 1:
				System.out.println("O mês é Janeiro");
				break;
			case 2:
				System.out.println("O mês é Fevereiro");
				break;
			case 3:
				System.out.println("O mês é Março");
				break;
			case 4:
				System.out.println("O mês é Abril");
				break;
			case 5:
				System.out.println("O mês é Maio");
				break;
			case 6:
				System.out.println("Mês de Junho");
				break;
			case 7:
				System.out.println("Mês de Julho");
				break;
			case 8:
				System.out.println("Mês de Agosto");
				break;
			case 9:
				System.out.println("Mês de Setembro");
				break;
			case 10:
				System.out.println("Mês de Outubro");
				break;
			case 11:
				System.out.println("Mês de Novembro");
				break;
			case 12:
				System.out.println("Mês de Dezembro");
				break;
			default:
				System.out.println("Mês invalido");
		}
	}
}
