public class ExemploString {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int x = 10;
        int y = 20;

        System.out.println(x + y + " this works");

        //need to use parenthesis in order to get the calc done
        System.out.println("This does not work " + x + y);

        //Capitalized cuz it's a class, not a primitive type
        String name = "Marlon";
        System.out.println(name + " is " + (x+y) + " years old.");

        //sequence scape \
        System.out.println("Oi \"Marlon\"");

        //\n
        System.out.println("Seu nome: \nMarlon");

        //\
        System.out.println("C:\\windows");

    }
}