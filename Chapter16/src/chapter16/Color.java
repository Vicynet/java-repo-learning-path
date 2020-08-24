package chapter16;

import java.util.EnumMap;

public enum Color {

    BLACK("Black", 1),
    WHITE("White", 2),
    BLUE("Blue", 3),
    GREEN("Green", 4),
    YELLOW("Yellow", 5),
    PINK("Pink", 6),
    RED("Red", 7),
    GREY("Grey", 8),
    ORANGE("Orange", 9),
    GOLD("Gold", 10),
    BROWN("Brown", 11),
    PURPLE("Purple", 12),
    TEAL("Teal", 13);

    // instance fields
    private final String color; // book title
    private final int defaultNumber; // copyright year

    Color(String color, int defaultNumber) {
        this.color = color;
        this.defaultNumber = defaultNumber;
    }

    public String getColor() {
        return color;
    }

    public int getDefaultNumber() {
        return defaultNumber;
    }

    public void systemColors(EnumMap<Color, Integer> j) {

    }

    public static void main(String[] args) {
        for (Color systemColors : Color.values()) {
            if (systemColors.defaultNumber == 2) {
                System.out.println(systemColors.color);
            }
        }
    }
}
