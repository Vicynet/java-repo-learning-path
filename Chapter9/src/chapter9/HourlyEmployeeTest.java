package chapter9;

public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Victor", "Ihedioha",
                "234-232-334", 48, 20);

//        System.out.println(hourlyEmployee.toString());
        try {
            hourlyEmployee.setHours(200);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(hourlyEmployee.getHours());
    }
}
