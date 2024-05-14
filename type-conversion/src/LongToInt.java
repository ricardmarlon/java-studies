public class LongToInt {
    public static void main(String[] args) {
        long x = 10;
        //in this case, need to explicit indicate to the compiler
        //you will use the conversion even there's data loss
        //forcing the casting
        int y = (int) x;

        System.out.println(y);
        System.out.println(x);

        long a = 9300000035L;

        //data loss 64bits to 32bits type
        int b = (int) a;
        System.out.println(a);
        System.out.println(b);
    }
}