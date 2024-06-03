public class nestedIF {
    public static void main(String[] args) {
        int x=30;
        int y=10;
        if(x>20)
        {
            System.out.println("X is > 20");
            if(y>5)
            {
                System.out.println("Y is > 5");
            }
        }
        else
        {
            System.out.println("X is not > 20");
        }
    }
}
