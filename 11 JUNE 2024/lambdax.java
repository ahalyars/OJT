interface Moperation
{
    int operate(int a,int b);
}
public class lambdax {
    public static void main(String[] args) {
        Moperation add=(a,b) -> a+b;  //lambda expression
        Moperation sub=(a,b) -> a-b;
        Moperation mul=(a,b) -> a*b;
        Moperation div=(a,b) -> a/b;

        int res1=add.operate(3,2);
        int res2=sub.operate(20,10);
        int res3=mul.operate(3,5);
        int res4=mul.operate(10,2);
        System.out.println("Add : "+res1);
        System.out.println("Sub : "+res2);
        System.out.println("Mul : "+res3);
        System.out.println("Div : "+res4);


    }
    
}
