class rectangle {
    int length,breadth,area;
    rectangle()
    {
        System.out.println("______Calculating the area of *Rectangle _______");
    }
    void calcArea(int length,int breadth)
    {
        area=length*breadth;
        System.out.println("The area of the rectangle is *:: "+area);
    }

    
}
public class construc {
    public static void main(String[] args) {
     rectangle rec=new rectangle();
     rec.calcArea(10, 10);   
    }
}
