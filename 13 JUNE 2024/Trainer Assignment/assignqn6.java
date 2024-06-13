class Student{
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }
}
public class assignqn6{
    public static void main(String[] args) {
        Student student1 = new Student("Aparna", 21, "A");
        Student student2 = new Student("Lisy ",21, "B");
        System.out.println(student1.getName());  
        System.out.println(student1.getAge());    
        System.out.println(student1.getGrade());  
        System.out.println(student2.getName());  
        System.out.println(student2.getAge());    
        System.out.println(student2.getGrade());  
    }
}