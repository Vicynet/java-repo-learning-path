import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        Scanner population = new Scanner(System.in);

        System.out.print("Enter Your Current World Population: ");
        float currentPopulation = population.nextFloat();

        System.out.print("Enter Annual Growth Rate: ");
        float annualGrowthRate = population.nextFloat();

        float year1PopulationForecast = (currentPopulation/100*annualGrowthRate) + currentPopulation;
        float year2PopulationForecast = (year1PopulationForecast/100*annualGrowthRate) + year1PopulationForecast;
        float year3PopulationForecast = (year2PopulationForecast/100*annualGrowthRate) + year2PopulationForecast;
        float year4PopulationForecast = (year3PopulationForecast/100*annualGrowthRate) + year3PopulationForecast;
        float year5PopulationForecast = (year4PopulationForecast/100*annualGrowthRate) + year4PopulationForecast;
        
        System.out.printf("World Population For 2021 is: %.2f\n", year1PopulationForecast);
        System.out.printf("World Population For 2022 is: %.2f\n", year2PopulationForecast);
        System.out.printf("World Population For 2023 is: %.2f\n", year3PopulationForecast);
        System.out.printf("World Population For 2024 is: %.2f\n", year4PopulationForecast);
        System.out.printf("World Population For 2025 is: %.2f", year5PopulationForecast);
        population.close();
    }
}