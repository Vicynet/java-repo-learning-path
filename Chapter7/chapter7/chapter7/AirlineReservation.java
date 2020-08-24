package chapter7;

import java.util.Scanner;

public class AirlineReservation {
    private static final Scanner seatType = new Scanner(System.in);
    public static void main(String[] args) {
        bookSeat();
    }

//    Your application should display the following alternatives: Please type 1 for First Class and
//    Please type 2 for Economy. If the user types 1, your application should assign a seat in the firstclass
//    section (seats 1–5). If the user types 2, your application should assign a seat in the economy
//    section (seats 6–10). Your application should then display a boarding pass indicating the person’s
//    seat number and whether it’s in the first-class or economy section of the plane.
//    Use a one-dimensional array of primitive type boolean to represent the seating chart of the
//    plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
//    each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
//    no longer available.
//    Your application should never assign a seat that has already been assigned. When the economy
//    section is full, your application should ask the person if it’s acceptable to be placed in the first-class
//    section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
//"Next flight leaves in 3 hours."

    public static void bookSeat() {
        boolean[] planeSeats = new boolean[10];
        int selectedSeatType = 0;
        String bookingOption;
        int bookingTrigger = 0;
        while (bookingTrigger < 10) {
            System.out.println("Please enter 1 for First Class or 2 for Economy");
            selectedSeatType = seatType.nextInt();
            if (selectedSeatType == 1) {
                for (int i = 0; i < 5; i++) {
                    if (!planeSeats[i]) {
                        planeSeats[i] = true;
                        System.out.printf("%s%d%s", "Your seat number is ", i, ", you are flying First Class");
                        for (boolean showBookings : planeSeats) {
                            System.out.println(showBookings);
                        }
                        System.out.println();
                    } else {
                        if (planeSeats.length <= 5 && !planeSeats[i]) {
                            System.out.println("All First Class seats taken, will you like to book Economy? Enter Yes or No.");
                            bookingOption = seatType.nextLine().toLowerCase();
                            if (bookingOption == "yes") {
                                for (i = 5; i < planeSeats.length; i++) {
                                    if (!planeSeats[i]) {
                                        planeSeats[i] = true;
                                        System.out.printf("%s%d%s", "Your seat number is ", i, ", you are flying Economy");
                                    } else {
                                        System.out.println("Next flight leaves in 3 hours");
                                    }
                                }
                            } else {
                                System.out.println("Next flight leaves in 3 hours");
                            }
                        }
                    }
                }
            } else if (selectedSeatType == 2) {
                for (int i = 5; i < planeSeats.length; i++) {
                    if (!planeSeats[i]) {
                        planeSeats[i] = true;
                        System.out.printf("%s%d%s", "Your seat number is ", i, ", you are flying Economy");
                    } else {
                        if (planeSeats.length > 5 && !planeSeats[i]) {
                            System.out.println("All Economy seats taken, will you like to book First Class? Enter Yes or No.");
                            bookingOption = seatType.nextLine().toLowerCase();
                            if (bookingOption == "yes") {
                                for (i = 1; i < 5; i++) {
                                    if (!planeSeats[i]) {
                                        planeSeats[i] = true;
                                        System.out.printf("%s%d%s", "Your seat number is ", i, ", you are flying First Class");
                                    } else {
                                        System.out.println("Next flight leaves in 3 hours");
                                    }
                                }
                            } else {
                                System.out.println("Next flight leaves in 3 hours");
                            }
                        }
                    }
                }
            } else {
                System.out.println("Please enter the correct number");
            }
        }
        bookingTrigger++;

    }
}
