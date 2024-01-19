class student{
    public int roll;
    public String name;
    public String course;
    public double m1,m2,m3;

    public student(){
        roll = 1;
        name = "Shivang";
        course="B.Tech";
        m1=78;
        m2=78;
        m3=78;
    }
    public student(double a, double b, double c){
        m1=a;
        m2=b;
        m3=c; 
    }
    
    public double total(){
        return m1 + m2 +m3;
    }
    public double avg(){
        return total()/3;
    }
    public char grade(){
        if (avg() > 90){
            return 'A';
        }
        if(avg() > 80 && avg() < 90){
            return 'B';
        }
        if (avg() > 70 && avg() < 80){
            return 'C';
        }
        if (avg() > 60 && avg() < 70){
            return 'D';
        }
        else{
            return 'E';
        }


    }

}


public class studentclass {
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println("Name" + s1.name);
        System.out.println(s1.avg());
        System.out.println(s1.total());
        System.out.println(s1.grade());

        student s2 = new student();
        System.out.println("Name "+ s2.name);
    }
    
}
