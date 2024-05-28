public class calculator {
    static void add(int x, int y)
    {
        System.out.println("Add = "+(x+y));
    }
    static  void sub(int x,int y)
    {
        System.out.println(x-y);
    }
    static  void div(int x,int y)
    {
        System.out.println(x/y);
    }
    public static void main(String[] args) {
        add(5, 6);
        sub(10,5);
        div(10, 2);
    }
}
