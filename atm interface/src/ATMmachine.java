import java.util.Scanner;
public class ATMmachine {
  
    int balance=10000;
    public  int withdraw(double amount){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the amount you want to withdraw");
        int withdrawamount=obj.nextInt();
        if(balance>=withdrawamount){
            balance=balance-withdrawamount;
            
        }else{
            System.out.println("insufficient balance");  
        }
        return withdrawamount;
    } 
    
    
    public  int deposit(double aamount){
         Scanner obj=new Scanner(System.in);
        System.out.println("enter the amount you want to deposit");
        int depositedamount=obj.nextInt();
        balance=balance+depositedamount;
        return depositedamount;
        
    }
    
    
    public  void checkbalance(){
    
       
        System.out.println("*****total balance="+balance+"*****");
       
    }
        
    
    
}
