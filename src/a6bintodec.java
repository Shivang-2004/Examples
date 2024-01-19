import java.util.*;

public class a6bintodec {
    public static int bintodec(int a){
        int pow =0; // power of 2.
        int dec = 0; // it will give us dec numvber.
        while (a>0) {// if no last digit then no conversion.
            int lastdigit = a%10; // last digit for the number.
            dec = dec + (lastdigit*(int)(Math.pow(2,pow)));
            pow++;
            a = a/10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in Binary here : ");
        int a = sc.nextInt();
        int b = bintodec(a);
        System.out.println("Your number in Decimal is : " + b);               
    }
    
}
