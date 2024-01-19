public class example {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
