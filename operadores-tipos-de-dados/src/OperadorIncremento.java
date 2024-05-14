public class OperadorIncremento {
    public static void main(String[] args) {

        int totalDownload = 10;

        //This is how to increment totalDownload = totalDownload + 1 or totalDownload += 1;
        //totalDownload++;

        int novoTotalDownload = ++totalDownload;


        System.out.println("Total de downloads: " + totalDownload);
        System.out.println("Novo Total de downloads: " + novoTotalDownload);
    }
}
