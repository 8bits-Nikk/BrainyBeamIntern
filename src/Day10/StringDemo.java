package Day10;

public class StringDemo {
    public static void main(String[] args) {

        String str1="JAVA";//creating string by java string literal
        char ch[]={'s','t','r','i','n','g','s'};
        String str2=new String(ch);//converting char array to string
        String str3=new String("Example Of String");//creating java string by new keyword

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
