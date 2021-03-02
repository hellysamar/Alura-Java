package sintaxe;

public class TesteVariavelPontoFlutuante {

	public static void main(String[] args) {
		
		double salario1 = 3600.00;
		double salario2 = 600.00;
		int diaTrabalhado = 22;
		double porDia;
		
		System.out.println("o Fulano recebia em seu último emprego R$"
				+ salario1 + " e por dia, recebia R$" + salario1 / diaTrabalhado);

		System.out.println("agora Fulano recebe em seu novo emprego R$"
				+ salario2 / diaTrabalhado + " por dia, portanto ele tem como salário mensal "
				+ salario2 + " R$");
				
        
		// numero inteiro dividido por numero inteiro no JAVA resulta em Nr Int;
        int divisao = 5 / 2;
        System.out.println(divisao);
       
        // se houver pelomenos um numero com ponto flutuante (tipo double) então 
        // o Java entente como double também os outros;
        double divisao2 = 5.0 / 2;
        System.out.println(divisao2);
	}
}

//int valor = 12.5;             //não compila.

//int valor2 = 0.0;             //não compila.

//double teste = 125.50;        // compila

//int valor3 = teste;           //não compila.
