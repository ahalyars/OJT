import java.lang.annotation.*;
class parent
{
    void display()
    {
        System.out.println("Parent class");
    }
}
class child extends parent
{
    @Override
    void display()
    {
        System.out.println("Child class");
    }
}
public class annotationEx {
    public static void main(String[] args) {
        parent p=new child();
        p.display();
    }
    
}
