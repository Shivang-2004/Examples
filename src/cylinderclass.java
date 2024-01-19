import java.util.*;

class cylinder{
    private double radius;
    double getRadius(){
        return radius;
    }
    void setRadius(double a){
        if(a>0){
            radius = a;
        }
        else{
            radius = 0.0;
        }
    }

    private double height;

    double getHeight(){
        return height;
    }
    void setHeight(double b){
        if(b>0){
            height = b; 
        }
        else{
            height=0.0;
        }
    }
    public cylinder(){
        radius = 1.0;
        height = 1.0;
    }

    public cylinder(double c, double d){
        radius = c;
        height = d;
    }

    public double basearea(){
        return Math.PI*radius*radius;
    }
}

public class cylinderclass {
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius for first cylinder : ");
        double a = sc.nextDouble();
        System.out.println("Enter your height for the first cylinder : ");
        double b = sc.nextDouble();
        cylinder c1 = new cylinder(a,b);
        System.out.println("The base area is "+ c1.basearea());


    }
    
    
}
