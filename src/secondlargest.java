 public class secondlargest{
    public static void main(String[] args) {
        int a[] = {43 , 21,1,45,7,6,9};
        int max = a[0];
        int max2nd = a[0];
        for(int i=0;i<a.length;i++){
            if (a[i]>max){
                max2nd = max;
                max = a[i];
            }
            else if  (a[i]>max){
                max2nd = a[i];
                }
        }
        System.out.println(max2nd);
    }
    
}
