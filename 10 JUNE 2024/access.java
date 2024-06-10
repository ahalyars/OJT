public class access {
    final int x = 10;
    final double PI = 3.14;
  
    public static void main(String[] args) {
        access myObj = new access();
      System.out.println(myObj.x); 
      System.out.println(myObj.PI); 
      //myObj.x = 50; // will generate an error: cannot assign a value to a final variable
      //myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    }
  }
  