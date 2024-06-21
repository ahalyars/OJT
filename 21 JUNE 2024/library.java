import java.util.ArrayList;
class Book{
    String title;
    String author;
    String isbn;
    boolean isavailable =true;
    public String name;
    public String id;
    Book(String title,String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isavailable = isavailable;
    }
}
class member{
     String name;
     String id;
     
    ArrayList<String> borrowedbooks = new ArrayList<String>();

    String getname(){
        return name;
    }
    String getid(){
        return id;

    }
    void setname(String newname){
        name=newname;
    }
    void setid(String newid){
        id=newid;
    }

    
    
    void addborrowbook(String book){
        if(borrowedbooks.size()<=5){
            borrowedbooks.add(book);
        }
        else{
            System.out.println("Sorry the limit is 5! for borrowed more book upgrade your account as premium");
        }
    }
    void returnbook(String book){
        borrowedbooks.remove(book);
    }
    

 }
class premiummember extends member {
    boolean ispremium = true;
    
    void addborrobook(String book,boolean ispremium){
        this.ispremium=ispremium;
        if(ispremium){
            if(borrowedbooks.size()<=10){
                borrowedbooks.add(book);
            }
            else{
                System.out.println("Sorry the limit is 10");
            }
        }
    }
    void returnbook(String book){
        borrowedbooks.remove(book);
    }

}
public class library{
    public static void main(String[] args) {
        Book book1 = new Book("java book","author1","4578");
       
            System.out.println("list of books");
            System.out.println(book1.title+" "+book1.author+" "+book1.isbn);
            member member1 = new member();
            member1.setname("Ahalya R S");
            member1.setid("152");
            System.out.println("Name :"+member1.getname()+ " id : "+member1.getid());
        
        }
        
    }
    
    

    

