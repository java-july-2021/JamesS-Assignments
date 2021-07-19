import java.util.Random;

/**
 * BankAccount
 */
public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingBalance;
    private static int totalAccounts = 0;
    private static double totalBalance = 0.00;


    public BankAccount(){
        this.accountNumber = this.randomAccountNumber();
        this.checkingBalance= 0;
        this.savingBalance=0;
        totalAccounts ++;
    }
    public double getCheckingBalance(){
        System.out.println(String.format("Checking Balance: %0.2f", this.checkingBalance));
        return checkingBalance;
    }
    public double getSavingBalance(){
        System.out.println(String.format("Savings Balance: %.2f", this.savingBalance));
        return savingBalance;
    }
    public String accountNumber(){
        return accountNumber;
    }
    public void depositChecking(double deposit){
        this.checkingBalance += deposit;
        
    }
    public void depositSaving(double deposit){
        this.savingBalance += deposit;
        
    }
    public void withdrawChecking(double withdraw){
        if (this.checkingBalance >= withdraw){
            this.checkingBalance -= withdraw;
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    public void withdrawSaving(double withdraw){
        if(this.savingBalance >= withdraw){
            this.savingBalance -= withdraw;
        }
        else {
            System.out.println("Insufficient funds");
        }
    }
    public double totalBalance(){
        double total = this.checkingBalance + this.savingBalance;
        return total;
    }
    public int totalAccounts(){
        int person = this.totalAccounts();
        return person;
    }

    public String randomAccountNumber(){
        Random account = new Random();
        for (int i = 0; i<10; i++){
            accountNumber = accountNumber.concat(String.valueOf(account.nextInt(10)));
        }
        return accountNumber;

    }
}