public class WorldPopulation {
    public static void main(String[] args) {
        long currentWorldPopulation = 7_631_091_040L; //Current World Population
        double growthRate = 1.08; //Declared Constant Growth Rate
        int yearCounter = 1; //Initial Value For 1st Year, To Be Increased Until 75th Year
        double diffWorldPopulation = 0; //Variable To Hold Difference Between Derived CurrentPopulation & Previous Population

        System.out.println("Year\t\tCurrent Population\tPopulation Difference From Last Year"); //Header Indicating Year, Current Population Derived and Difference

        //Counter Block Initiated Using While Loop To Get Population Range For The Next 75 Years
        while (yearCounter <= 75) {

            diffWorldPopulation = (currentWorldPopulation/100)*growthRate;
            currentWorldPopulation = (long)currentWorldPopulation + (long)((currentWorldPopulation/100)* growthRate);

            System.out.printf("Year %d\t\t%,d\t\t%,d\n", yearCounter, currentWorldPopulation, (int)diffWorldPopulation);
            yearCounter++;
        }
        //End Of Counter
    }
}