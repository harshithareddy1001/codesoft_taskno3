
import java.util.Scanner;
public class userbankaccount  {
   
    public static void main(String args[]){
         
     int withdrawamount = 0;
     int depositedamount=0;
        Scanner obj=new Scanner(System.in);
       ATMmachine atm=new ATMmachine(); 
       while(true){
                System.out.println("WELCOME TO ATM");
         System.out.println("1:WITHDRAW");
          System.out.println("2:DEPOSIT");
           System.out.println("3:CHECK BALANCE");
            System.out.println("4:EXIT");
             System.out.println("CHOOSE ANY OPTION");
             int choice=obj.nextInt();
             
             switch(choice){
                 case 1:
                     atm. withdraw(withdrawamount);
                      break;
                 case 2:
                    atm. deposit(depositedamount);
                     break;
                 case 3:
                    atm.checkbalance();
                
                     break;
                 case 4:
                      System.out.println("### THANK YOU ###");
                       System.exit(0);
                 default:
                      System.out.println("select valid option");
                      break;
                     
             }
           
    }
    
}
}
