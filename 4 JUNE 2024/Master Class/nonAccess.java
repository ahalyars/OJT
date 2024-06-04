class nonAcc{
    public static int x=0;
    public int y=0;
    
    public nonAcc()
    {
        x++;
        y++;
       
    }
    public void result()
    {
        System.out.println("the value of X :: "+x);
        System.out.println("The value oif y :: "+y);
      
    }
}

public class nonAccess {
    public static void main(String[] args)
    {
        nonAcc myobj=new nonAcc();
        System.out.println("the value of X with the object :: "+myobj.x);
        System.out.println("The value oif y with the object:: "+myobj.y);
        myobj.result();
        nonAcc myobj1=new nonAcc();
        System.out.println("the value of X with the object :: "+myobj1.x);
        System.out.println("The value oif y with the object:: "+myobj1.y);
        myobj.result();
    }
}
