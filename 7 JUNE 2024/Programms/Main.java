// Create a Java program that demonstrates inheritance by modeling an employee hierarchy. 
// Have a base class Employee and derived classes Manager and Developer.

class employee {
    void job(){
        System.out.println("I am the employee in this company.");
    }
}
class manager extends employee
{
    void manage(){
        System.out.println(" I am the manager of this company.");
    }
}
class Developer extends employee
{
    void develop(){
        System.out.println("I am the developer in this company.");
    }
}
public class Main
{
    public static void main(String[] args) {
        manager mymanager=new manager();
        Developer mydeveloper=new Developer();
        mydeveloper.job();
        mydeveloper.develop();
        mymanager.job();
        mymanager.manage();
    }
}
