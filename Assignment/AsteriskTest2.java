public class AsteriskTest2 {
    public static void main(String[] args) {
        int counter = 1;
        int space = 4;

        while (counter <= 4) {
            int number = 4;
            int sp = 1;
            int number2 = 4;
            while (number >= counter) {
                System.out.print("*");
                --number;
            }
            while(sp <= space){
                System.out.print(" ");
                sp++;
            }
            while(number2 >= counter){
                System.out.print("*");
                --number2;
            }
                System.out.println();
                space--;
                space+=3;

                ++counter; 
                
            }
            // while (tab <= space) {
            //     System.out.print(" ");
            //     tab++;
            //     }  
                        
            //     while (number2 <= counter) {
            //         System.out.print("*");
            //         number++;
            //     }
            //         System.out.println();
            //         space--;
            //         counter++;
            // } 
            
                         
            /*while (counter <= 4) {
                int number = 1;
                while (number <= counter) {
                    System.out.print("*");
                    ++number;
                } 
                     
                    System.out.println();
                    ++counter;
                }*/
                // while (counter <= 4) {
                //     int number = 1;
                //     int tab = 0;
                //     int number2 = 1;
                //     while (number <= counter) {
                //         System.out.print("*");
                //         number++;
                //     }
                        
                //     while (tab <= space) {
                //         System.out.print(" ");
                //         tab++;
                //     }  
                    
                //     while (number2 <= counter) {
                //         System.out.print("*");
                //         number++;
                //     }
                //         System.out.println();
                //         space--;
                //         counter++;
                //     } 
                     


                // while(counter <= 4){
                //     int star1 = 1;
                //     int star2 = 1;
                //     int sp = 1;

                //     while(star1 <= counter){
                //         System.out.print("*");
                //         star1++;
                //     }
                //     while(sp<= space){
                //         System.out.print(" ");
                //         sp++;
                //     }
                //     while(star2 <= counter){
                //         System.out.print("*");
                //         star2++;
                //     }
                //     System.out.println();
                //     space--;

                //     counter++;
                // }
    }
}