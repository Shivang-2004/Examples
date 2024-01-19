public class a12binarysearch {
    public static int binsear(int num[], int key ){
        int start = 0;
        int end = num.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            if (num[mid] == key){
                return mid;
            }
            if (num[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int num[]= {1,4,5,7,8,9,12,13,17,18};
        int key = 9;
        int c = binsear(num, key);
        if (c == -1){
            System.out.println("404 NOT FOUND");
        }
        else{
            System.out.println("Your number is at the index : " + c);
        }

    }
    
}
