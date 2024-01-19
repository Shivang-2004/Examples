class circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*radius*Math.PI;
    }
}

public class circleoop {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.radius=5;
        System.out.println(c1.area());
        System.out.println(c1.circumference());
    }
    
}
