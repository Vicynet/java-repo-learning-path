public class HeartRates {
    private String firstName, lastName;
    private int day, month, year;

    public HeartRates(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int ageCalculator() {
        int calculateAge = 2020 - year;
        return calculateAge;
    }

    public int maxHeartRate() {
        int calculateMaxHeartRate = 220 - ageCalculator();
        return calculateMaxHeartRate;
    }

    public double targetHeartRate() {
        double calculateTargetHeartRate = maxHeartRate()*0.5;
        return calculateTargetHeartRate;
    }
}