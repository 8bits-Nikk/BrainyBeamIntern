package Day11;

public class Bank {
    public long calcInterest(long principalAmount, int noOfYears){
       final float rateOfInterest = 7.5f;
        return (long) ((principalAmount * rateOfInterest * noOfYears)/100);
    }
}
