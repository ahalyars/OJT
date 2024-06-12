interface book{
    final int pages = 260;
    public void display();
}
class records implements book{
    public void display(){
        System.out.println("I am a book I have "+pages+" Pages");
    }
}
public class interfaceex {
    public static void main(String[] args) {
        records obj = new records();
        obj.display();
        System.out.println("Pages :"+obj.pages);
    }
    
}
