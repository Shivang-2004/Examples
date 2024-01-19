import java.util.*;

import javax.sound.sampled.SourceDataLine;

interface member{
    void callBack();
}
class customer implements member{
    String name;
    customer(String n ){
        n = name;
    }
    public void callBack(){
        System.out.println("Ok. i will visit"+name);
    }

    
}
class store{
    member mem[] = new mem[100];
    int count = 0;
    void register(member m){
        mem[count++] = m;
    }
    void inviteSale(){
        for(int i = 0; i<count ; i++){
            mem[i].callBack();
        }
    }

}



public class interfacestore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n
        


        customer c1 = new customer(name[]);

    }

}
// What i was trying to here is make a register of customer that inculed a lot of name as it is made up using arrys 