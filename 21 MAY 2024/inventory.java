import java.util.ArrayList;

public class inventory {
    ArrayList<String> Products = new ArrayList<>();

        public void add(String Product){
            Products.add(Product);
        }
        public void remove(String Product){
            Products.remove(Product);
        }
        public void displayProducts() {
            for (String Product : Products) {
                System.out.println(Product);
            }
        }
        public void isInventory() {
            int low = 3;
            int len = Products.size();
            if(len < low){
                System.out.println("low inventory alert");
            }
            else{
                System.out.println("Inventory sufficient");
            }
        }
        
    public static void main(String[] args) {
        
        inventory inventory = new inventory();
        inventory.add("book1");
        inventory.add("book2");
        inventory.add("book3");
        inventory.add("book4");
        inventory.add("book5");
        inventory.add("book6");
        
        
        inventory.remove("book3");
        inventory.displayProducts();
        inventory.isInventory();

     
      
    }
    
}