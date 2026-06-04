package programa;

import java.util.Scanner;

public class Beecrowd1837 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//leia o valor do dividendo
		int dividendo = input.nextInt();
		//leia o valor do divisor
		int divisor = input.nextInt();
		int quociente;
		int resto;
		//faça a divisão e obtenha o quociente
		quociente = dividendo/divisor;
		//faça o valor do resto ser igual a divisor vezes quociente menos dividendo.
		resto = (-divisor * quociente) + dividendo;
		//SE o resto for menor que zero e maior ou igual ao divisor absoluto
		if(resto < 0 || resto >= Math.abs(divisor)) {
			//subtrai 1 do quociente
			quociente--;
			resto = dividendo - (divisor * quociente);

			if(resto < 0) {
				quociente +=2;
				resto = dividendo - (divisor * quociente);
			}
			//faça o valor do resto ser igual a divisor vezes quociente menos dividendo.
						
		}
		//imprime o valor do quociente e o valor do resto
		System.out.print(quociente + " ");
		System.out.println(resto);
		
	}
}
