package Day2;

public class Modifiers {

    // Data with access modifiers
    private int pri_data = 10;
    int de_data = 15;
    public int pub_data = 12;
    protected int prot_data = 20;

    // methods
    private void accessPrivate(){
        System.out.println("Private data: "+pri_data);
    }

    void accessDefault(){
        System.out.println("Default data: "+de_data);
    }

    public void accessPublic(){
        System.out.println("Public Data: "+pub_data);
    }

    protected void accessProtected(){
        System.out.println("Protected data: "+prot_data);
    }

}
