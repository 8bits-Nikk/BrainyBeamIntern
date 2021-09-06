package Day3;

interface Cricketer {
    public void printCricketerInfo();
}

interface Bowler extends Cricketer {
    public void printBowlerInfo();
}

interface Batsman extends Cricketer {
    public void printBatsmanInfo();
}

public class AllRounder {
    public void printCricketerInfo(){
        System.out.println("printCricketerInfo() method called..");
    }
    public void printBatsmanInfo() {
        System.out.println("printBatsman() Method called.");

    }
    public void printBowlerInfo() {
        System.out.println("printBowler() Method called.");
    }

}
