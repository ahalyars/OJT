public class access8 {
    final int x = 10;
  
    public static void main(String[] args) {
      access8 myObj = new access8();
      myObj.x = 25; // will generate an error
      System.out.println(myObj.x); 
    }
  }
  