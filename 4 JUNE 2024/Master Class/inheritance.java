

class shape
{
    int length,area;
    public void show()
    {
        System.out.println(area);
    }
}
class box extends shape
{
    int width,height;
    public box(int l,int w,int h)
    {
        length=l;
        width=w;
        height=h;
        area=l*w*h;
    }
}
class  square extends shape
{
square(int s)
{
    length=s;
}

public void show()
{
    area=length*length;
    System.out.println("the area of a square is : "+area);
}

}

public class inheritance {
    public static void main(String[] args) {
        square s=new square(5);
        s.show();
        box b=new box(2,3,4);
        b.show();
    }
}
