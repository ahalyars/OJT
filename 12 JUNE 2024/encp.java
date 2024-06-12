class encapsulatedClass
{
    private String data;
    public String getData()
    {
        return data;
    }

public void setData(String data)
{
    this.data=data;
}
}

public class encp {
    public static void main(String[] args) {
        encapsulatedClass obj = new encapsulatedClass();
        obj.setData("Hello");
        System.out.println(obj.getData());
    
}
}
