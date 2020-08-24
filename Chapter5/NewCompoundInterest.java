/*A person invests $1,000 in a savings account yielding 5% interest. Assuming that all
the interest is left on deposit, calculate and print the amount of money in the account
at the end of each year for 10 years. Use the following formula to determine the
amounts:
a = p (1 + r)n
where
p is the original amount invested (i.e., the principal)
r is the annual interest rate (e.g., use 0.05 for 5%)
n is the number of years
a is the amount on deposit at the end of the nth year.*/
public class NewCompoundInterest {
    public static void main(String[] args){
        double amount = 0; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        int year;
        System.out.printf("\t%6.2f(rate)\t%8.2f(rate)\t%10.2f(rate)\t%4.2f(rate)\t%6.2f(rate)\t%8.2f(rate)%n",0.05,0.06,0.07,0.08,0.09,0.1);
        //double rate = 0.05; // interest rate

        //System.out.printf("%s%20s%n", "Year", "Amount on deposit");
    
        // calculate amount on deposit for each of ten years
        for (year = 1; year <= 10; ++year) {
        // calculate new amount for specified year
            for (double i = 5; i <= 10; i++) {
                amount = principal * Math.pow(1.0 + (i/100), year);
                System.out.printf("%5d%,13.2f", year, amount);
                // display the year and the amount
            }
            System.out.println();
        } 
       
        
    }
}