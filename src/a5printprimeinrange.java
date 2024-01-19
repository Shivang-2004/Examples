import java.util.*;

public class a5printprimeinrange {
    public static boolean isprime(int a) {
        if (a == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i)
        }
        return true;
    }

    public static void prime(int a) {
        for (int i = 2; i <= a; i++) {
            boolean b = isprime(i);
            if (b == true) {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till where you want the prime numbers : ");
        int a = sc.nextInt();
        prime(a);
    }
}
