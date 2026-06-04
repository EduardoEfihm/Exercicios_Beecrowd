package programa;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1041 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		
		if(y == 0 || x == 0) {
			if(y == 0 && x == 0){
				System.out.println("Origem");
			}
			else if(y == 0) {
				System.out.println("Eixo X");
			}
			else {
				System.out.println("Eixo Y");
			}
			
		}
		else if(y < 0 || x < 0) {
			if(y < 0 && x < 0) {
				System.out.println("Q3");
			}
			else if( y < 0) {
				System.out.println("Q4");
			}
			else if( x < 0) {
				System.out.println("Q2");
			}
		}
		else {
			System.out.println("Q1");
		}
	}
}
