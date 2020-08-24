package chapter14.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TokenizingTelephoneNumbers {
    public static void main(String[] args) {

        Scanner phone  = new Scanner(System.in);

        System.out.print("Enter your phone number (555) 555-5555: ");

        String phoneNumber = phone.nextLine();
        String[] splitter = phoneNumber.split("[- ()]");
        System.out.printf("Area code: %s%nPhone number: %s", splitter[1], splitter[3].concat(splitter[4]));
    }
}
