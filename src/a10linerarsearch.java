public class a10linerarsearch {
    public static int linearsearch(int num[], int key){
        for (int i = 0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int num[] = {12,34,2,3,5,56,7,34,67,43,45};
        int key = 56;
        int index = linearsearch(num, key);
        System.out.println(index);
        
    }
    
}
