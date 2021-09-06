package Day5;

public class Employee {
    private int id;
    private String name;
    private int noOfDays;
    private float dailyWages;

    public Employee(int id, String name, int noOfDays, float dailyWages) {
        this.id = id;
        this.name = name;
        this.noOfDays = noOfDays;
        this.dailyWages = dailyWages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public float getDailyWages() {
        return dailyWages;
    }

    public void setDailyWages(float dailyWages) {
        this.dailyWages = dailyWages;
    }
}
