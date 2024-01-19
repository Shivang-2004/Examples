import java.util.*;

class Accounts{
    private String accno;
    private String name;
    private String address;
    private int phone_number;
    private String dob;
    public double balance;

    String getAccNo(){
        return accno;
    }
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    void setAddress(String mango){
        address = mango;
    }
    int sePhoneNumber(){
        return phone_number;
    }
    String getDOB(){
        return dob;
    }
    double getbalance(){
        return balance;
    }
    //this is contructor. (here down this)
     public Accounts(String hui, String huii, String huiii, int huiiii, String huiiiii, double huiiiiii ){
         accno = hui;
         name = huii;
         address = huiii;
         phone_number = huiiii;
         dob = huiiiii;
         balance = huiiiiii;
    }



}

class savingsacc extends Accounts{
    public void deposit(double a){
        balance += a;
        System.out.println("Your current balance is :"+ balance);
    }
    public void withdraw(double b){
        if(b>balance){
            System.out.println("You don't have enough money");
        }
        else{
            balance -= b;
            System.out.println("Your current balance is :"+ balance);
        }
    }
}

class loanAcc extends Accounts{

}


public class bank {
    public static void main(String[] args) {
        String accno = "Help_me_here";
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello welcome, to create your new accounts give me the following details.");
        System.out.print("Enter yout name here : ");
        String name = sc.nextLine();
        System.out.print("Enter your address here :");
        String address = sc.nextLine();
        System.out.print("Enter your mobile number here :");   
        int number = sc.nextInt();
        System.out.print("Enter Your date of birth :");
        String dob = sc.next();
        System.out.print("Enter the amount of money that you want to submit in your account : ");
        double balance = sc.nextDouble(); 
        Accounts a=new Accounts(accno, name, address, number, dob, balance );
    }
}
