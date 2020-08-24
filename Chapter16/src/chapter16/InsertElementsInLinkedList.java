package chapter16;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class InsertElementsInLinkedList {
//    (Inserting Elements in a LinkedList in Sorted Order) Write a program that inserts 25 random
//    integers from 0 to 100 in order into a LinkedList object. The program should sort the elements,
//    then calculate the sum of the elements and the floating-point average of the elements.

    public static void main(String[] args) {
        SecureRandom elementGenerator = new SecureRandom();

        List<Integer> generatedElements = new LinkedList<>();

        //generate random number 20 times
        for (int i = 0; i < 20 ; i++) {
            //insert 20 random numbers into linked list
            generatedElements.add(elementGenerator.nextInt(101));
        }

        System.out.println(generatedElements); //print linked list after adding 20 random numbers
        Collections.sort(generatedElements);
        System.out.println(generatedElements); //print linked list to show successful sorting

        int totalElements = 0;
        double averageAllElements = 0.0;
        for (int i = 0; i < generatedElements.size(); i++) {
            totalElements += generatedElements.get(i);
            averageAllElements = totalElements / generatedElements.size();
        }

        System.out.printf("%nTotal Elements: %d%nAverage: %.2f", totalElements, averageAllElements);
    }
}
