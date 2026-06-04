package programa;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		//ler a quantidade de casos de teste
		int casos = input.nextInt();
		
		//declarar as variaveis correspondente ao char
		int somaCobaias;
		int totalCoelhos=0;
		int totalRatos=0;
		int totalSapos=0;		
		//fazer um laço que repita a mesma quantidade de veezs
		for(int i = 0; i < casos; i++) {
			//ler 2 valores, um inteiro e o outro char
			int quantidade = input.nextInt();
			char inicialCobaia = input.next().charAt(0);
			
			if(inicialCobaia == 'C') {
				//Somar o valor a variavel que corresponde ao char
				totalCoelhos += quantidade;
			}
			else if (inicialCobaia == 'R'){
				totalRatos += quantidade;
			}
			else if (inicialCobaia == 'S') {
				totalSapos += quantidade;
			}
		}
		
		somaCobaias = totalCoelhos + totalRatos + totalSapos;
		//fazer a porcentagem de cada uma das cobaias.
		System.out.println("Total: " + somaCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);
		System.out.println("Percentual de coelhos: " + String.format("%.2f",((double)totalCoelhos/somaCobaias) * 100)+ " %");
		System.out.println("Percentual de ratos: " + String.format("%.2f",((double)totalRatos/somaCobaias) * 100)+ " %");
		System.out.println("Percentual de sapos: " + String.format("%.2f",((double)totalSapos/somaCobaias) * 100)+ " %");
		
		input.close();
	}

}
