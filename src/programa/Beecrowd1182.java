package programa;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1182 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		//ler um valor inteiro para definir qual coluna da matriz será lida
		int n = input.nextInt();
		int contador=0;
		//ler um char para definir se será feito uma soma ou uma média 'S' e 'M'
		char op = input.next().charAt(0);
		double valor=0;
		//criar uma matriz de 2 vetores com o valor colocado
		double[][] matriz = new double [3][3];
		//criar um loop que preencha a matriz
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j< 3; j++) {
				matriz[i][j] = input.nextDouble();
				
				//criar uma condição que acesse os valores da coluna lida
				if(j == n) {
					valor += matriz[i][j];
					contador++;
				}
			}
		}
		System.out.println(String.format("%.1f",operacao(valor, op, contador)));
		
	}
	// criar um metodo que faça a conta de acordo com o char lido e o valor digitado
	public static double operacao(double valor, char ope, int cont) {
		
		// caso o char digitado for 'M' crie uma variavel contador e divida pela soma
		if(ope == 'M') {
			valor /= cont;
		}
		// retorne o valor da soma.
		return valor;
	}
	

}
