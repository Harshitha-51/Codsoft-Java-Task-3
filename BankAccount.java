
import java.util.Scanner;
class ATM{
    public void check_balance(int k){
        System.out.println("The available bank balance is: "+ k);
    }
    public int deposit(int b,int d){
        int sum=b+d;
        return sum;
    }
    public int withdraw(int b,int d){
        int sub=b-d;
        return sub;
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the balance: ");
        int balance=sc.nextInt();
        ATM a=new ATM();
        System.out.println("enter 1 to check balance");
        System.out.println("enter 2 to deposit ");
        System.out.println("enter 3 to withdraw ");
        int num=sc.nextInt();
        switch(num){
            case 1:
                a.check_balance(balance);
                break;
            case 2:
                System.out.println("Enter amount to deposit: ");
                int amount=sc.nextInt();
                int k1=a.deposit(balance,amount);  
                balance=k1;
                System.out.println("Amount has been deposited Successfully");
                System.out.println("Your Total Bank balance is: "+balance);
                break;
            case 3:
                System.out.println("Enter amount to withdraw: ");
                int amount1=sc.nextInt();
                if(amount1<=balance){
                    int k2=a.withdraw(balance,amount1);
                    balance=k2;
                }
                else{
                    System.out.println("Insufficient Bank Balance");
                    break;
                }
                System.out.println("Amount has  been withdrawn successfully");
                System.out.println("Your remaining Bank balance is: "+balance);          
        }
    }
    
}
