package chapter7;

public class SalesCommissionTest {
    public static void main(String[] args) {
        int[] salesArray = {1000, 2000, 1500, 3000, 2500, 200, 100, 300, 5000, 4000};

        SalesCommission salesCommission = new SalesCommission("Workers Weekly Salary", salesArray);
        System.out.println(salesCommission.getSalaryType());
        salesCommission.processSalary();
    }
}
