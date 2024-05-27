class outer
{
    int x=5;
    class inner{
        int y=10;
    }
}
public class innerClass {
    public static void main(String[] args) {
        outer myouter=new outer();
        outer.inner myinner=myouter.new inner();
        
        System.out.println(myinner.y+myouter.x);
    }
}
