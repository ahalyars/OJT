import java.lang.annotation.*;
@interface Myannotation
{
    String value();
}
public class customann {
    public static void main(String[] args) {
       customann obj=new customann();
       obj.annmethod();
    }
    private Object obj;
       Myannotation ann=obj.getClass().getMethod(("method").getAnnotation(Myannotation.class));
        
    
    @Myannotation("Customer Annotation")
    public void annmethod()
        {
            System.out.println("This is annopted Method");
        }
}
