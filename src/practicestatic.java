 class supershivang{
    static int price = 10;
    int a = 34;
    public static void onroadprice(String n){
        if(n == "delhi"){
            System.out.println("Price is 10");
        }
        else{
            System.out.println("Price is 12");
        }
    }
}


public class practicestatic {
    public static void main(String[] args) {
        supershivang s = new supershivang();
        supershivang s1 = new supershivang();
        System.out.println(s.price);
        System.out.println(s1.price);
        System.out.println(supershivang.price);
        System.out.println(s.a);
        System.out.println(s1.a);


    }
}
