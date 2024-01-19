import java.util.*;

abstract class shape{
    abstract public float area();
    abstract public float perimeter();
}
class circle extends shape{
    private float radius;
    float getRadius(){
        return radius;
    }
    void setRadius(float r){
        radius = r;
    }
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2.00f*3.14f*radius;
    }
    
}
class rectangle extends shape{
    private float length;
    private float breadth;

    float getLength(){
        return length;
    }
    void setLength(float l){
        length = l;
    }
    float getBreadth(){
        return breadth;
    }
    void setBreadth(float b){
        breadth = b;
    }
    public float area(){
        return length*breadth;
    }
    public float perimeter(){
        return 2.00f*(length+breadth);
    }

}


public class abstractclassshape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle c = new circle();
        System.out.print("Enter the radius of circle here :");
        float radius = sc.nextFloat();
        c.setRadius(radius); 
        System.out.println(c.area());
    }
    
}
