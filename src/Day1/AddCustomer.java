package Day1;

public class AddCustomer {
    public static void main(String[] args) {
        Customers customers1 = new Customers();
        Customers customers2 = new Customers(2,"Dhruvi",20);
        System.out.println("======== Default Constructor ========");
        display(customers1);
        System.out.println("======== Parameterized Constructor ========");
        display(customers2);
    }
    public static void display(Customers c){
        System.out.println(String.format("Customer ID:%d \nCustomer Name:%s \nCustomer Age: %d",
                c.getC_id(),c.getC_name(),c.getC_age()));
    }

}
