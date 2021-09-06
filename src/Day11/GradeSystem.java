package Day11;

public class GradeSystem implements GradeInterface{
    float marks;
    String name;
    public GradeSystem (String name,float marks){
        this.marks = marks;
        this.name = name;
    }

    @Override
    public void grading() {
        if(marks <= 100 && marks >=80){
            System.out.println(name+" Grade is: A");
        }else if(marks <80 && marks >=70){
            System.out.println(name+" Grade is: B");
        }else if(marks <70 && marks >=60){
            System.out.println(name+" Grade is: C");
        }else if(marks <60 && marks >=50){
            System.out.println(name+" Grade is: D");
        }else {
            System.out.println(name+" Grade is: F");
        }
    }


    public static void main(String[] args) {
        GradeSystem stu1 = new GradeSystem("Student 1",65);
        GradeSystem stu2 = new GradeSystem("Student 2",90);
        GradeSystem stu3 = new GradeSystem("Student 3",20);

        stu1.grading();
        stu2.grading();
        stu3.grading();

    }
}
