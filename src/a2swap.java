public class a2swap{
public static void swap(int a, int b){
int c =a;
a=b;
b=c;
System.out.println("a = "+ a);
System.out.println("B = "+ b);
}
public static void main(String args[]){
int a = 4;
int b = 5;
swap(a,b);
System.out.println("a = "+ a);
System.out.println("B = "+ b);
}
}
