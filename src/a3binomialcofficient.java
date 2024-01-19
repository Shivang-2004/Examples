import java.util.*;

public class a3binomialcofficient{
public static int fact(int a){
if ( a == 1){
return 1;
}
int b= a*fact(a-1);
return b;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n here : ");
int a = sc.nextInt();
System.out.println("Enter the value of r here : ");
int b = sc.nextInt();
int c = fact(a);
int d = fact(b);
int e = fact(a-b);
int f = c/(d*e);
System.out.println("The Binomial coffcient of given values is : ");
System.out.println(f);
}
}
