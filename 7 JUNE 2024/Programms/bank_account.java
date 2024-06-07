
// Ensure that the account balance cannot be directly accessed and provide methods to deposit, withdraw, and check the balance.  
class bank{
    private String name;
    private  int id;
    private double balance=0;

public String getname()
{
    return name;
}
public int getid()
{
    return id;
}
public void setname(String names)
{
name=names;
}
public void setid(int ids)
{
    id=ids;
}
public double getbalance()
{
    return balance;
}
public void withdraw(double amount)
{
    balance=balance-amount;
}
public void deposit(double amount)
{
    balance=balance+amount;

}
public class bank_account
{
    public static void main(String[] args) {
        bank myBank=new bank();
        myBank.setname("Ahalya");
        myBank.setid(2563);
        
        System.out.println("Name - "+myBank.getname());
        System.out.println("Id - "+myBank.getid());
        myBank.deposit(1000) ;
        
        myBank.deposit(2000);
        myBank.withdraw(200);
        System.out.println(myBank.getbalance());
       
    }
}
}