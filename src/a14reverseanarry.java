public class a14reverseanarry {
    public static void rev(int arr[]){
        int a = 0, b=arr.length-1; // a = zero index and b last index.
        while(a<b){
            int temp;
            temp = arr[a];
            arr[a]= arr[b];
            arr[b]= temp;
            a++;
            b--;
        }
        System.out.print("{");
        for(int j=0; j<=arr.length-1;j++){
            System.out.print(arr[j]);
            System.out.print(",");
        }
        System.out.print("}");

    }
    public static void main(String[] args) {
        int[] arr = new int[10];
               
    }
    
}
