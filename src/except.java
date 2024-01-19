public class except {
    static int area(int a, int b){
        int area = a*b;
        return area;
    }
    static void meth(){
        int a = 10;
        int b = 4;
        int c = area(10,4);
        System.out.println(c);
    }
    public static void main(String[] args) {
        meth();
    }
}
