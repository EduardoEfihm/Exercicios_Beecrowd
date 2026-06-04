package programa;

import java.util.Scanner;

public class Beecrowd1101 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		while (input.hasNextInt()) {
			//leia um par de numeros
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			
			if (num1 <= 0 || num2 <= 0) {
				 break; 
			}
			
			//defina quem é maior e quem é menor
			if(num1 > num2) {
				contador(num2, num1);
			}
			else {
				contador(num1, num2);
			}
		}
			
	
	}
	
		public static void contador(int a, int b) {
			int sum=0;
			
			//faça uma contagem do menor para o maior
			for (; a <= b; a++) {
				//demonstre nesse formato de saida: 3 4 5 6 Sum=18
				System.out.print(a + " ");
				//some todos os numeros contados(incluso o par de numeros)
				sum += a;
			}
			System.out.println("Sum="+ sum);
			
	}
}
