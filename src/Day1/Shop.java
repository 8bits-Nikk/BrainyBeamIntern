package Day1;

public class Shop {
    public static void main(String[] args) {
        Customers customer1 = new Customers();
        customer1.setC_name("Nikhil");
        customer1.setC_id(01);
        customer1.setC_age(20);

        System.out.println(String.format("Customer ID:%d \nCustomer Name:%s \nCustomer Age: %d",
                customer1.getC_id(),customer1.getC_name(),customer1.getC_age()));
    }
}
