package sintaxe;

public class TesteCondicional {

	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		System.out.println("");
		
		int idade = 30;
		boolean temCertificado = false;
		boolean estaAcompanhado = false;
		
		if (idade > 0 && idade <= 12) {
			System.out.println("Fulano ainda é uma Crionça.");
		} else if (idade >= 12 && idade < 18){
			System.out.println("Fulano já é aborrecente");
		} else if (idade > 18 && idade <= 30) {
			System.out.println("já é um Adulto");
		} else if (idade > 30 && idade < 120) {
			System.out.println("então, já passou dos 30");
		} else {
			System.out.println("tem certeza que digitou a idade certa?");
		}
		
		if (idade > 18 && temCertificado || estaAcompanhado) {
			System.out.println("parabéns!");
		} else {
			System.out.println("Sentimos muito.");
		}
	}
}
