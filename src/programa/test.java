package programa;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Random;
public class test {

	public static void main(String[] args) {
		Random random = new Random();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
 
        int quantidade = 10; // altere para quantas datas quiser
 
        System.out.println("=== Datas Aleatórias (01/01/2022 - 01/01/2027) ===\n");
 
        for (int i = 1; i <= quantidade; i++) {
            int ano = 2022 + random.nextInt(5);
            int mes = 1 + random.nextInt(12);
            int dia = 1 + random.nextInt(YearMonth.of(ano, mes).lengthOfMonth());
 
            LocalDate dataAleatoria = LocalDate.of(ano, mes, dia);
            System.out.println("Data " + i + ": " + dataAleatoria.format(formatter));
        }
    }
}
