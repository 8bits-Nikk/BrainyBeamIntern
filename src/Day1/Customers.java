package Day1;

public class Customers {

    // Data
    private int c_id;
    private String c_name;
    private int c_age;

    // Default Constructor
    Customers(){
        this.c_id = 1000;
        this.c_name = "Nikk";
        this.c_age = 20;
    }

    // Parameterized Constructor
    Customers(int c_id,String c_name,int c_age){
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_age = c_age;
    }

    // Getter and Setter
    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getC_age() {
        return c_age;
    }

    public void setC_age(int c_age) {
        this.c_age = c_age;
    }
}
