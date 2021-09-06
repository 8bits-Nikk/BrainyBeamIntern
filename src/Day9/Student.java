package Day9;

public class Student {

    private final int rollNo;
    private final String name;
    private final String grade;

    public Student(int rollNo, String name, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString(){
        return String.format("Roll No.: %d \nName: %s \nGrade: %s",
                rollNo,name,grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"Nikhil","AB");
        Student student2 = new Student(2,"Dhruvi","AA");

        System.out.println("==========================");
        System.out.println(student1);
        System.out.println("==========================");
        System.out.println(student2);
        System.out.println("==========================");
    }
}
