package Day2;

public class ModifiersDemo{
    public static void main(String[] args) {

        // Object of Modifier class
        Modifiers am = new Modifiers();

        // Access Private method and variable
//        System.out.println(am.pri_data);            // Gives Compilation Error
//        am.accessPrivate();
//        System.out.println("========================");

        // Access Public method and variable
        System.out.println(am.pub_data);
        am.accessPublic();
        System.out.println("========================");

        // Access Default method and variableS
        System.out.println(am.de_data);
        am.accessDefault();
        System.out.println("========================");

        // Access Protected method and variable
        System.out.println(am.prot_data);
        am.accessProtected();
        System.out.println("========================");
    }
}
