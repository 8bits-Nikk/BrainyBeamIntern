package Day11;

public class SBIBank extends Bank{

    public long calcInterest(long principalAmount, int noOfYears) {
        final float rateOfInterest = 5.5F;
        return (long) ((principalAmount * rateOfInterest * noOfYears)/100);
    }

    public static void main(String[] args) {
        SBIBank bank = new SBIBank();
        bank.show();

    }
    public void show(){
        System.out.println("SBI Bank Interest: "+ calcInterest(10000,1));
        System.out.println("Bank Interest: "+super.calcInterest(10000,1));
    }
}
