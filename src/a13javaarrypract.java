import java.util.*;

public class a13javaarrypract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length for your string : ");
        int a = sc.nextInt();
        int arry[] = new int[a];
        int i = 0;
        while(i<arry.length){
            System.out.println("Marks in subject " + (i+1));
            arry[i]=sc.nextInt();
            i++;
        }
        for(int j = 0; j<arry.length; j++){
            System.out.println("Marks in subject " +(j+1)  + " "  + arry[j]);
        }
        
    }        
}
