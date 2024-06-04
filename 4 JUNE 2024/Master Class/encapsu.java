class employee
{
    private String name;
    private int age;

    public void setName(String newName)
    {
        name=newName;
    }
    public  String getName()
    {
        return name;
    }
    public void setAge(int newAge)
    {
        age=newAge;
    }
    public void agedec()
    {
        age--;
    }
    public void ageicc()
    {
        age++;
    }
    public int getAge()
    {
        return age;
    }
}

public class encapsu {
    public static void main(String[] args) {
        employee myemp=new employee();
        myemp.setName("Ahalya");
        myemp.setAge(24);
        System.out.println("Emp_name : " +myemp.getName());
        System.out.println("Emp_age  : "+myemp.getAge());
        myemp.ageicc();
        System.out.println("Emp_age  : "+myemp.getAge());
        myemp.agedec();
        System.out.println("Emp_age  : "+myemp.getAge());
    }
}
