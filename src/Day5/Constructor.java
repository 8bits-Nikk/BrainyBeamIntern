package Day5;

public class Constructor {
    int num1,num2;
    Constructor(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void addition(){
        int ans = num1+num2;
        System.out.println("Addition is: "+ans);
    }
}
