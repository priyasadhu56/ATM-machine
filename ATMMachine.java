import java.util.Scanner;

class ATM{

    float Balance;
    int PIN = 2005;
    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
    
        int enterdpin = sc.nextInt();
        if(enterdpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter the valid pin");
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            WithdrawMoney();
        }
        else if(opt == 3){
            DepositeMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
            
        }
    }

    public void checkBalance(){
        System.out.println("Balance: "+ Balance);
        menu();
    }
    public void WithdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Wiyhdeawl Successful");


        }
        menu();

    }
    public void DepositeMoney(){
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();

    }
   
}
public class ATMMachine{
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
        
    }

}