public class BankAccount { 
    private String accountNumber; 
    private String accountHolderName; 
    private double balance; 
 
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) { 
        this.accountNumber = accountNumber; 
        this.accountHolderName = accountHolderName; 
        this.balance = initialBalance; 
    } 
 
    public void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
            System.out.println("Deposited " + amount + ". New balance is " + balance); 
        } else { 
            System.out.println("Deposit amount must be positive."); 
        } 
    } 
 
    public void withdraw(double amount) { 
        if (amount > 0) { 
            if (balance >= amount) { 
                balance -= amount; 
                System.out.println("Withdrew " + amount + ". New balance is " + balance); 
            } else { 
                System.out.println("Insufficient balance."); 
            } 
        } else { 
            System.out.println("Withdrawal amount must be positive."); 
        } 
    } 
 
    public void checkBalance() { 
        System.out.println("Current balance is " + balance); 
    } 
 
    public static void main(String[] args) { 
        BankAccount account = new BankAccount("123456789", "Ahalya", 1000); 
        BankAccount account1 = new BankAccount("123789489", "Appu", 2000); 
        account1.checkBalance();
        account1.deposit(600);
        account1.withdraw(1500);  
    } 
} 