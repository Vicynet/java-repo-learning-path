public class Tester {
    public static void main(String[] args) {
        int count1 = 1;
        
        while (count1 <= 5) {
            int count2 = 1;
            int count3 = 0;
            int count4 = 5;
            while (count4 >= count1) {
                System.out.print(" ");
                count4--;     
            }
            while (count3 <= (count1 - 2)) {
                System.out.print((count1 - count3));
                count3++;     
            }
            while (count2 <= count1) {
                System.out.print(count2);
                count2++;
            } 
            System.out.println();
            count1++;
        }
    }
}