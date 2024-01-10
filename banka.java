/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Bankaccount{
    private String account_name;
    private String account_num;
    private double balance;
    
public Bankaccount(String account_name, String account_num, double balance){
    this.account_name=account_name;
    this.account_num=account_num;
    this.balance=balance;
}
public void deposit(double amount){
    if (amount>0){
    balance+=amount;
    System.out.println("Deposited Amount" + amount + " Current Balance:" + balance);
    }
    else
    System.out.println("Invalid Amount");
}
public void withdraw(double amount){
    if (amount>0){
        if (amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdraw Amount" + amount + " Current Balance:" + balance);
        }
        else
        System.out.println("Insufficient Amount");
    }
    System.out.println("Invalid Amount");
}
public void display_balance(){
    System.out.println("Account Holder:"+account_name);
    System.out.println("Account Number:"+account_num);
    System.out.println("Account Balance:"+balance);
}
public static void main (String[] args){
    Bankaccount cus1= new Bankaccount("liki","2267879",1500);
    cus1.display_balance();
    cus1.deposit(2000);
    cus1.display_balance();
    cus1.withdraw(1500);
    cus1.display_balance();
}
}