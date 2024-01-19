public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {9,14,15,12,6,8,13};
        int n = arr.length;
        // for(int i = 0; i<=n-2; i++ ){
        //     int min = i;
        //     for(int j = i; j<=n-1; j++){
        //         if(arr[min]>arr[j]){
        //             min = j;
        //         }
        //     }
        //     temp = arr [min];
        //     arr[min] = arr[i];
        //     arr[i]= temp;
        // }
        //int count = 1;
        //boolean isswapdone = false;
        //for(int i = n-1; i>=1;i--){
        //    for(int j =0; j<i ; j++){
        //        if(arr[j]>arr[j+1]){
        //            temp = arr[j];
        //            arr[j] = arr [j+1];
         //           arr[j+1]= temp;
         //           isswapdone = true;
        //        }
        //    }
        //    if(!isswapdone){
        //        break;
        //    }
        //
        
        //count++;

        for(int i = 0; i<=n-1; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        
         for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
        }
        

    }
    
}
