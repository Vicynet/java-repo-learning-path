public class HealthProfile {
    private String firstName, lastName, gender;
    private int day, month, year;
    private double height, weight;

    public HealthProfile(String firstName, String lastName, String gender, int day, int month, int year, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public double bmi() {
        double bmiCalculator = (getWeight()/(getHeight()*getHeight()))*703;
        return bmiCalculator;
    }

}