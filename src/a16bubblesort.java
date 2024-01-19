public class a16bubblesort{
    public static void bubblesort(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j = 0; j<arr.length -1-turn ; j++){
                if(arr[j] < arr[j+1]){
                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1]; //i am typing with the  hell of my phone lol.....@  
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void bubblesortace(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j = 0; j<arr.length -1-turn ; j++){
                if(arr[j] > arr[j+1]){
                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        System.out.print("{");
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
    }    

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubblesort(arr);
        System.out.println("Arranged in decending order.");
        printarr(arr);
        System.out.println();
        System.out.println("Arranged in acending order");
        bubblesortace(arr);
        printarr(arr);
        System.out.println();

    }
}