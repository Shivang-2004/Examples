import java.util.*;
public class a4primeornot{
public static boolean isPrime(int n){
boolean prime = true;
for (int i = 2; i<=Math.sqrt(n) ; i++){
if(n%i==0){
prime = false;
}
}
return prime;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your number here : ");
int a = sc.nextInt();
boolean b = isPrime(a);
System.out.print("Is your number prime " + b);
}
}
