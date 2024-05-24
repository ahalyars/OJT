public class fibannacci {
    public static void main(String[] args) {
        int f1=-1,f2=1,f3,limit;
        limit=5;
        for(int i=0;i<limit;i++)
        {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.println(f3);
        }
    }
}
