package Day5;

public class Demo extends Constructor{
    Demo(int num1,int num2){
        super(num1,num2);
    }

    public static void main(String[] args) {
        Demo demo = new Demo(10,20);
        demo.addition();
    }
}
