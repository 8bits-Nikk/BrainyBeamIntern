package Day11;

public class Shape {

    public static int areaVolume(int l,int b){
        return l*b;
    }

    public static int areaVolume(int l,int b,int h){
        return l*b*h;
    }
    public static void main(String[] args) {
        System.out.println("Area: "+areaVolume(12,23));
        System.out.println("Volume: "+areaVolume(3,20,10));
    }
}
