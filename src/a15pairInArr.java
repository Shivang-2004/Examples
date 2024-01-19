public class a15pairInArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,};
        System.out.print("{");
        for(int i=0; i<=arr.length-1; i++){
            for(int j=i+1; j<=arr.length-1; j++){
                System.out.print("(");
                System.out.print((i+1)+ " " + " " + arr[j]);
                System.out.print(")");
                if(j == arr.length-1){
                    break;
                }
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
    
}
