public class OperadorDecremento {
    public static void main(String[] args) {
        int limiteTentativasLogin = 10;

        //limiteTentativasLogin--;

        //int novoTentativaLogin = limiteTentativasLogin--;
        int novoTentativaLogin = --limiteTentativasLogin;

        System.out.println("Limite tentativas: " + limiteTentativasLogin);
        System.out.println("Novo Limite tentativas: " + novoTentativaLogin);

    }
}
