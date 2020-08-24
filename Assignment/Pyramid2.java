  public class Pyramid2
{            
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            int n = 5;
   
            for (int j = 1; j<= n - i; j++) { 
                System.out.print(" "); 
            } 
            // for (int k = i; k >= 1; k--)
            // {
            //     System.out.print(k);
            // }
            for (int l = 2; l <= i; l++) { 
                System.out.print(l); 
            } 
             System.out.println(); 
        } 
    }
}
// public class Pyramid2 {
//     public static void main(String[] args) {
//         int counter = 5;
//         int count = 1;
//         int numb = 1;
//         while (count <= 5) {
//             int number = 1;
//             while (number <= counter-count) {
//           System.out.println(" ");
//             }
//             while (numb <= count-1) {
//                 numb--;
//             System.out.println();
//             }
                
//                 // System.out.print(counter);
//                 // System.out.print(number);
                
//                 // ++number;
                
//             }
//             System.out.println(); 
            
//             ++counter;        
//     }
// }