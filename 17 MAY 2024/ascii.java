public class ascii {
    public static void main(String[] args) {
        char a='2';
        if(a>=65 && a<=90)
        {
            System.out.println("Given Letter is UpperCase");
        }
        else if(a>=97 && a<=122)
        {
            System.out.println("Given Letter is LowerCase");
        }
        else
        {
            System.out.println("Invalid Letter");
        }
    }
}
