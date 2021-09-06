package Day3;

public interface Multiplication {
    default void doMultiplication(int data1,int data2){
        System.out.println("Multiplication: "+data1*data2);
    }
}
