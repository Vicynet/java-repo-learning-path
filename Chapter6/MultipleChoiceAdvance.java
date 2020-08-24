import  java.util.Scanner;
public class MultipleChoiceAdvance {
    private static Scanner getInput = new Scanner(System.in);
    private static int score = 0;
    private static int trackQuestions = 0;
    private static int question1;
    private static int question2;
    private static int question3;
    private static int question4;
    private static int question5;
    private static int level;
    public static void main(String[] args) {
        startQuiz();
    }
    public static void easyLevel() {
        System.out.println("Easy Level Selected!\n");
        System.out.print("Question 1: Who is the founder of Semicolon Africa\n1. Patience Semi\n2. Gbemi Rara\n3. Sam Immanuel\n4. Nonso Mmuonso\n\nEnter your answer: ");
        question1 = getInput.nextInt();
        trackQuestions++;
        if (question1 == 3) {
            score++;
        }
        System.out.print("\nQuestion 2: Who is the full meaning of SQL\n1. Structured Query Language\n2. Structural Query Language\n3. Shared Question List\n4. Simple Query Language\n\nEnter your answer: ");
        question2 = getInput.nextInt();
        trackQuestions++;
        if (question2 == 1) {
            score++;
        }
        System.out.print("\nQuestion 3: Which is not a programming language\n1. Java\n2. Html\n3. Python\n4. C++\n\nEnter your answer: ");
        question3 = getInput.nextInt();
        trackQuestions++;
        if (question3 == 2) {
            score++;
        }
        System.out.print("\nQuestion 4: How many sides does a dice have\n1. One\n2. Three\n3. Four\n4. Six\n\nEnter your answer: ");
        question4 = getInput.nextInt();
        trackQuestions++;
        if (question4 == 4) {
            score++;
        }
        System.out.print("\nQuestion 5: Choose the odd option\n1. Act\n2. For\n3. While\n4. Switch\n\nEnter your answer: ");
        question5 = getInput.nextInt();
        trackQuestions++;
        if (question5 == 1) {
            score++;
        }
        remark();
    }
    public static void hardLevel() {
        System.out.println("Hard Level Selected!\n");
        System.out.print("Question 1: Who is the founder of Semicolon Africa\n1. Patience Semi\n2. Gbemi Rara\n3. Sam Immanuel\n4. Nonso Mmuonso\n\nEnter your answer: ");
        question1 = getInput.nextInt();
        trackQuestions++;
        if (question1 == 3) {
            score++;
        }
        System.out.print("\nQuestion 2: Who is the full meaning of SQL\n1. Structured Query Language\n2. Structural Query Language\n3. Shared Question List\n4. Simple Query Language\n\nEnter your answer: ");
        question2 = getInput.nextInt();
        trackQuestions++;
        if (question2 == 1) {
            score++;
        }
        System.out.print("\nQuestion 3: Which is not a programming language\n1. Java\n2. Html\n3. Python\n4. C++\n\nEnter your answer: ");
        question3 = getInput.nextInt();
        trackQuestions++;
        if (question3 == 2) {
            score++;
        }
        System.out.print("\nQuestion 4: How many sides does a dice have\n1. One\n2. Three\n3. Four\n4. Six\n\nEnter your answer: ");
        question4 = getInput.nextInt();
        trackQuestions++;
        if (question4 == 4) {
            score++;
        }
        System.out.print("\nQuestion 5: Choose the odd option\n1. Act\n2. For\n3. While\n4. Switch\n\nEnter your answer: ");
        question5 = getInput.nextInt();
        trackQuestions++;
        if (question5 == 1) {
            score++;
        }
        remark();
    }
    public static void showFailedQuestions() {
        if (question1 != 3) {
            System.out.println("\nCorrect answer for question 1: Who is the founder of Semicolon Africa\n3. Sam Immanuel");
        }
        if (question2 != 1) {
            System.out.println("\nCorrect answer for question 2: Who is the full meaning of SQL\n1. Structured Query Language");
        }
        if (question3 != 2) {
            System.out.println("\nCorrect answer for question 3: Which is not a programming language\n2. Html");
        }
        if (question4 != 4) {
            System.out.println("\nCorrect answer for question 4: How many sides does a dice have\n4. Six");
        }
        if (question5 != 1) {
            System.out.println("\nCorrect answer for question 5: Choose the odd option\n1. Act");
        }  
    }
    public static void showScore() {
        System.out.println("\nYou got " + score + " correctly, " + "out of " + trackQuestions + " questions");
    }
    public static void remark() {
        showScore();
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
        showFailedQuestions();
    }
    public static void startQuiz() {
        System.out.println("Enter 1 For Level-1(Easy) or 2 For Level-2(Hard)");
        level = getInput.nextInt();
        quizLevel();
    }
    public static void quizLevel() {
        switch (level) {
            case 1:
                easyLevel();
                break;
            case 2:
                hardLevel();
                break;
        }
    }
}