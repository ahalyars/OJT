class Shape{
    void draw(){
        System.out.println("  Draws a Shape");
    }
}
class circle extends Shape{
    @Override
    void draw(){

        System.out.println("Draw Rectangle");
    }
}
class rectangle extends Shape{
    @Override
    void  draw(){
        System.out.println("Draw Circle");
    }
}

public class shapes {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        Shape Circle = new circle();
        Circle.draw();
        Shape Rectangle = new rectangle();
        Rectangle.draw();
    }
}