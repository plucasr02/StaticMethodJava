package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.Converter;

public class Dolar {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui o preço do Dollar: ");
        Double dollar = sc.nextDouble();

        System.out.println("Quantos de Dollar você comprou?: ");
        Double compraDollar = sc.nextDouble();

        Double conversao = Converter.CurrencyConverter(dollar, compraDollar);

        System.out.printf("Digite aqui o preço do dollar: %.2f%n", conversao);

        sc.close();
    }
}
