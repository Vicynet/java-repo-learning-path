import java.security.SecureRandom;
  
class RandomNumber { 
    public static void main(String args[]) 
    { 
       // create instance of Random class 
       SecureRandom random = new SecureRandom();
       int randomNumber = 1;

      for(int rand = 1; rand <= 20; rand++) {
        randomNumber = 1 + random.nextInt(20);
            if (randomNumber%3 == 0){
                System.out.println("Random Integers: "+ randomNumber); 
            }
      }
     
    } 
}