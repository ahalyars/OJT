class inventory {
    private String ItemId;
    private String name;
    private int quantity;
    private double price;
    
    public inventory(String ItemId, String name, int quantity, double price) {
    this.ItemId = ItemId;
    this.name = name;
    this.quantity = quantity;
    this.price = price; 
    }
    public void updateQuantity(int addquantity){
       
            quantity+=addquantity;
        
        
    }
    
    public void displayDetails(){
        System.err.println("ItemId :"+ItemId);
        System.err.println("Name :"+name);
        System.err.println("Quantity :"+quantity);
        System.err.println("Price :"+price* quantity);
    }
}
public class item{
    public static void main(String[] args) {
        inventory item = new  inventory("151","pen",2,5);
        item.displayDetails();
        item.updateQuantity(5);
    }
    
}

    
