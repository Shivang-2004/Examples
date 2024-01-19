public class s1dsa {
    public static int namen(int a){
        if(a==0){
            return 1;
        }
        System.out.println("Shivang");
        namen(a-1);
        return 1;
    }
    public static void main(String[] args) {
        int a = 5;
        namen(a);
    }
}
