public class prime {
    public static void main(String[] args) {
        int x=4;
        boolean flag=true;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                flag=false;
               break;
            }
        }
        if(flag)
        {
            System.out.println("Prime");
        }
        else
        {
            System.err.println("Not a prime");
        }
    }
}
