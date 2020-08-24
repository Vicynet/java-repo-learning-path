package chapter20;

//import java.util.ArrayList;
import java.util.*;

public class CustomArray {
    int i, n = 4;
    ArrayList<StudData> list = new ArrayList<>();


    class StudData {
        int roll;
        String name;
        int marks;
        long phone;

        public StudData(int roll, String name, int marks, long phone) {
            this.roll = roll;
            this.name = name;
            this.marks = marks;
            this.phone = phone;
        }
    }

    public static void main(String[] args) {
        int roll[] = {1,2,3,4};
        String name[] = {"Victor", "Eme", "Madu", "David"};
        int marks[] = {100, 98, 45, 65};
        long phone[] = {149002003L, 199393011L, 993990203L, 9993420043L};

        CustomArray ca = new CustomArray();
        ca.addValues(roll, name, marks, phone);
    }

    private void addValues(int[] roll, String[] name, int[] marks, long[] phone) {
        for (int i = 0; i < n; i++) {
            list.add(new StudData(roll[i], name[i], marks[i], phone[i]));
        }
        printValues(list);
    }

    public void printValues(ArrayList<StudData> list) {
        for (int i = 0; i < n; i++) {
            StudData data = list.get(i);
            System.out.println(data.roll+" "+data.name+" "+data.marks+" "+data.phone);
        }
    }
}
