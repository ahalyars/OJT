class bankac{
    private String name;
    private String actid;
    private double balance=0;

    public String getName(){
        return name;
    }
    public String getactid(){
        return actid;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String newname){
        name = newname;
    }
    public void setactid(String newid){
        actid = newid;
    }

public void withdrow(double withdrow){

    if(balance > 0 && balance > withdrow){
        balance = balance - withdrow;
        System.out.println("Your withdrowal amount is : "+ withdrow);
    }
    else{
        System.out.println("No sufficient balance");
    }
    
}

public void deposit(double amount){
    balance = balance+amount;
}

}
public class bank_ac {
    public static void main(String[] args) {
        bankac obj = new bankac();
        obj.setName("Ahalya");
        obj.setactid("2555");
        
        System.out.println("Name : "+obj.getName());
        System.out.println("Account Id : "+obj.getactid());
        //System.out.println("Balance :"+obj.getBalance());
        obj.deposit(5000);
        obj.withdrow(5800);
        obj.withdrow(5800);
        System.out.println("Current Balance :"+obj.getBalance());

    }
    
}