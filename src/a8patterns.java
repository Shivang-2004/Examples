import java.util.*;
public class a8patterns {
    public static void easy_patterns(){
        System.out.println("This is pattern 1 : ");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("This is pattern 2 : ");
        for(int i =1; i<=4 ;i++){
            for (int j = 4; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
         System.out.println("This is pattern 3 : ");
         for(int i =1; i<=4 ;i++){
            for (int j = 1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("This is pattern 4 : ");
        char ch = 'A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    } 
    public static void hollow_rect(int a, int b){//a=total rows b=total cols.
        System.out.println("This is pattern 5 : ");
        for(int i=1; i<=a ; i++){
            for(int j=1; j<=b; j++){
                if(i==1 || i==a || j==1 || j==b ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for your hollow rectangle : ");
        int a = sc.nextInt();
        System.out.println("Enter the number for the columns for the hollow rectangle : ");
        int b = sc.nextInt();
        hollow_rect(a, b);
        
    }
    
}
