class Superr{
    public void method(){
        System.out.println("This is super class");
    }
}

class subb extends Superr{
    public void method(){ 
        System.out.println("this is sub class");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Superr s= new Superr();
        s.method();
        subb s1 = new subb();
        s1.method();
    }
    
}
