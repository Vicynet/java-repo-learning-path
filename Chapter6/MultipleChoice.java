import  java.util.Scanner;
public class MultipleChoice {
    private static Scanner getAnswer = new Scanner(System.in);
    private static int score = 0;
    private static int choice;
    public static void main(String[] args) {
        remark();
    }
    public static void showQuestions() {
        System.out.print("Who is the founder of Semicolon Africa\n1. Patience Semi\n2. Gbemi Rara\n3. Sam Immanuel\n4. Nonso Mmuonso\n\nEnter your answer: ");
        choice = getAnswer.nextInt();
        if (choice == 3) {
            score++;
        }
        System.out.print("\nWho is the full meaning of SQL\n1. Structured Query Language\n2. Structural Query Language\n3. Shared Question List\n4. Simple Query Language\n\nEnter your answer: ");
        choice = getAnswer.nextInt();
        if (choice == 1) {
            score++;
        }
        System.out.print("\nWhich is not a programming language\n1. Java\n2. Html\n3. Python\n4. C++\n\nEnter your answer: ");
        choice = getAnswer.nextInt();
        if (choice == 2) {
            score++;
        }
        System.out.print("\nHow many sides does a dice have\n1. One\n2. Three\n3. Four\n4. Six\n\nEnter your answer: ");
        choice = getAnswer.nextInt();
        if (choice == 4) {
            score++;
        }
        System.out.print("\nChoose the odd option\n1. Act\n2. For\n3. While\n4. Switch\n\nEnter your answer: ");
        choice = getAnswer.nextInt();
        if (choice == 1) {
            score++;
        }
        System.out.println("\nYou got " + score + " correctly");
    }
    public static void remark() {
        showQuestions();
        switch (score) {
            case 5:
                System.out.println("Excellent!!!");
                break;
            case 4:
                System.out.println("Very good!!");
                break;
            default:
                System.out.println("You need to brush up your knowledge!");
                break;
        }
    }
}