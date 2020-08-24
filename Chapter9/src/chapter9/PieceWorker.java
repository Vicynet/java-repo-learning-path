package chapter9;

public class PieceWorker extends Employee {
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public String toString() {
        return String.format("%s", super.toString());
    }
}
