public class a17selectionsort {
    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[i]){
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
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
        int arr[] = {5,2,1,4,3};
        selectionsort(arr);
        printarr(arr);

    }
    
}
