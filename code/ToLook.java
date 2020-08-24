package defaultmethod.multipleinheritance;

import java.util.HashMap;
import java.util.Scanner;

public class ToLook {
    /*
    you to validate some task e.g
    if user enter string value, exception will be thrown,
    to avoid that i add try & catch to catch the error
     */
    public void doValidate() {
        System.out.print("Enter 1 to Login or Enter 2 Register: ");
        try {
            Scanner integerUserInput = new Scanner(System.in);
            int userValidate = integerUserInput.nextInt();
            if (userValidate != 1 && userValidate != 2) {
                System.out.println("Invalid input: enter either 1 or 2 ");
                return;
            }
            if (userValidate == 1) {
                //you need to store the user for you to perform login operation..either in file,database
                System.out.println("have not implement the feature");
            } else {
                Scanner scanner = new Scanner(System.in);
                HashMap<String, String> hashMap = new HashMap<>();
                System.out.print("Enter full Name: ");
                hashMap.put("name", scanner.nextLine());
                System.out.print("Enter your email address: ");
                hashMap.put("email", scanner.nextLine());
                System.out.print("Enter phone number: ");
                hashMap.put("phone", scanner.nextLine());
                System.out.print("Enter your residential address: ");
                hashMap.put("address", scanner.nextLine());
                System.out.println("Hey " + hashMap.get("name") + ", Thank you for signing up on theSharpTenant! with your email address" + hashMap.get("email"));
            }
        } catch (Exception e) {
            System.out.println("Invalid input: ");
        }
    }

    public static void main(String... args) {
        ToLook toLook = new ToLook();
        toLook.doValidate();

    }
}
