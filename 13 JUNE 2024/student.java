public class student {
    private String name;
    private String studentId;
    private int grade;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        if (grade >100 && grade <0) {
            this.grade = grade;
        } else {
           System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }
    public static void main(String[] args) {
        student mystudent = new student();
        mystudent.setName("AHALYA");
        mystudent.setStudentId("1001");
        mystudent.setGrade(105);
        System.out.println("Name: " + mystudent.getName());
        System.out.println("Student ID: " + mystudent.getStudentId());
        System.out.println("Grade: " + mystudent.getGrade());

        
    }
}