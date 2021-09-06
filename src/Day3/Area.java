package Day3;

public class Area extends Details{

    public Area(int length, int breadth, int height) {
        super(length, breadth, height);
    }

    public void findArea(){
        int area = super.length * super.breadth;
        System.out.println("Area is: "+area);
    }

}
