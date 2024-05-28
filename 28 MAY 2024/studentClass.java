class student{
  private  String StudentId;
  private String Name;
  private int age;
  
  private double Mark ;

  public student(String StudentId, String Name,int age, double Mark){
      this.StudentId = StudentId;
      this.Name = Name;
      this. age = age;
      this.Mark = Mark;


  }
  public void uploadGrade(double updateMark){
    if(Mark > 0){
      Mark = Mark + updateMark;
      System.out.println("Mark updated successfully ");
      System.out.println("Updated mark is :"+Mark);
      
    }
    else{
      System.out.println("Mark not updated");
    }
  }
  public void studentDetails(){
      System.err.println("Student Id :"+StudentId);
      System.err.println("Name :"+Name);
      System.err.println("Age :"+age);
      System.err.println("Mark :"+Mark);
  }
  
}
public class studentClass {
  public static void main(String[] args) {
      student student1 = new student("101","Lisy J",23,80);
      student1.studentDetails();
  }
}