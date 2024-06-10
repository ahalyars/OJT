public class pattern {
    public static void main(String[] args) {
        int a=6;
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<i;j++)  // Square pattern :: for(int j=0;j<nj++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
