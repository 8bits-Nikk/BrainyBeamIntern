package Day11;

public class GradingSystem extends Grading{
    float marks;
    String name;
    public GradingSystem(String name,float marks){
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
        Grading stu1 = new GradingSystem("Student 1",86);
        Grading stu2 = new GradingSystem("Student 2",56);
        Grading stu3 = new GradingSystem("Student 3",35);

        stu1.grading();
        stu2.grading();
        stu3.grading();
    }
}
