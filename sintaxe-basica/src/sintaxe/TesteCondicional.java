package sintaxe;

public class TesteCondicional {

	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 3;
		
		if (idade <= 12) {
			System.out.println("Fulano ainda é uma Crionça.");
		} else if (idade >= 12 && idade < 18){
			System.out.println("Fulano já é aborrecente");
		} else if (idade > 18 && idade <= 30) {
			System.out.println("já é um Adulto");
		} else if (idade > 30) {
			System.out.println("então, já passou dos 30");
		}
	}
}
