package programa;
import  java.util.Scanner;

public class Beecrowd2949 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
 
        int hobbits = 0, humanos = 0, elfos = 0, anaoes = 0, magos = 0;
 
        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine().trim();
            char tipo = linha.charAt(linha.length() - 1);
 
            switch (tipo) {
                case 'X': hobbits++; break;
                case 'H': humanos++; break;
                case 'E': elfos++;   break;
                case 'A': anaoes++;  break;
                case 'M': magos++;   break;
            }
        }
 
        System.out.println(hobbits + " Hobbit(s)");
        System.out.println(humanos + " Humano(s)");
        System.out.println(elfos   + " Elfo(s)");
        System.out.println(anaoes  + " Anao(oes)");
        System.out.println(magos   + " Mago(s)");
    }
	

}
