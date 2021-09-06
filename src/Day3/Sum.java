package Day3;

public interface Sum {
    default void doSum(int data1,int data2){
        int ans = data1 + data2;
        System.out.println("Sum: "+ans);
    }
}
