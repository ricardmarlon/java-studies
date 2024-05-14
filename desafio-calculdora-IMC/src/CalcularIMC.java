import java.util.Locale;
import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Sexo: F ou M");
        String sexo = sc.nextLine().toUpperCase();


        System.out.println("Seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Seu altura: ");
        double altura = sc.nextDouble();

        double imc = peso/(altura*altura);

        System.out.printf("Seu IMC: %.2f%n", imc);


        if(sexo.equals("F")) {
            if(imc < 19.1) {
                System.out.println("Abaixo do peso.");
            }else if (imc <= 25.8) {
                System.out.println("No peso ideal.");
            }else if (imc <= 27.3) {
                System.out.println("Acima do peso.");
            }else if (imc <= 33.3) {
                System.out.println("Acima do peso ideal.");
            }else {
                System.out.println("Obeso");
            }

        }
        else{
            if(imc < 20.7) {
                System.out.println("Abaixo do peso.");
            }else if (imc <= 26.4) {
                System.out.println("No peso ideal.");
            }else if (imc <= 27.8) {
                System.out.println("Acima do peso.");
            }else if (imc <= 31.1) {
                System.out.println("Acima do peso ideal.");
            }else {
                System.out.println("Obeso");
            }
        }

    }
}