package sintaxe;

public class TesteCharEString {

	public static void main (String[] args) {
		char letra = 'a'; 			// cabe apenas um caractere no char;
		System.out.println(letra);

		char valor = 66;			// o numero inteiro cabe no char mesmo sendo um dezena pois ele indica o caractere que está nessa dezena na tabela Unicode;
		System.out.println(valor);
		
		valor = (char) (valor + 1);	// sem o char precedendo a soma do valor + 1, o resultado seria do tipo Int
		System.out.println(valor);
		
		String nota = "hoje foi o dia, ";
		String nota2 = "o dia de inicio no trampo";
		String mes = "fevereiro";
		int ano = 2021;
		
		System.out.println(nota + "e eu nem sei como pode, mas " + nota2 + " foi em " + mes + " " + ano);
	
		String frase = "a tarde se inicia as " + 12 + " horas.";
		
		System.out.println(frase);
	}
}
