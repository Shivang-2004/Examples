import java.util.*;

public class a7dectobin {
    public static int dectobin(int a){
        int pow = 0;
        int bin = 0;
        while (a >=1){
            bin = bin + (a%2)*(int)(Math.pow(10,pow));
            pow++;
            a=a/2;
        }
        return bin;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in Decimal to convert it into Binary : ");
        int a = sc.nextInt();
        int b = dectobin(a);
        System.out.println("Binary : " + b);
    }
    
}
