import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class IndiceMassaCorporal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Seu peso: ");
        int peso = sc.nextInt();

        System.out.println("Sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso/(altura*altura);

        System.out.println("IMC: "+imc);

    }
}