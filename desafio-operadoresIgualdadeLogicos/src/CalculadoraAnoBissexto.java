import java.util.Scanner;

public class CalculadoraAnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano para saber se é bissexto: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.printf("%d é ano bissexto", ano);
        }else {
            System.out.println("Não é ano bissexto");
        }
    }
}