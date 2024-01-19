abstract class shivang{
    shivang(){
        System.out.println("This is constructor of Super class.");
    }
    public void method1(){
        System.out.println("This is method 1 of superclass");
    }
    abstract public void method2();
}
class shivang2 extends shivang{
    @Override
    public void method2(){
        System.out.println("This is an overridded method here");
    }
    public void method3(){
        System.out.println("This is method 3 of subclass ");
    }

}



public class abstractclass {
    public static void main(String[] args) {
        shivang s = new shivang2();
        s.method2();
        s.method1();
        shivang2 s1 = new shivang2();
        s1.method1();
        s1.method2();
        s1.method3();
    }
    
}
