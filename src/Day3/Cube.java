package Day3;

public class Cube extends Details{

    public Cube(int length, int breadth, int height) {
        super(length, breadth, height);
    }

    public void findCube(){
        int cube = super.length * super.breadth * super.height;
        System.out.println("Cube is: "+cube);
    }
}
