import java.util.Scanner;
import java.util.ArrayList;
public class Tweets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tweetCount = 0;
        int count = 0;
        int countTweet = 0;
        ArrayList<String> myTweets = new ArrayList<String>();

        System.out.print("Enter Number of tweets: ");
        int n = input.nextInt();
        input.nextLine();

        while(count < n) {
            myTweets.add(input.nextLine().toLowerCase().replaceAll("[#, @]", " "));
            count++;
            System.out.println(myTweets);
        }
        for(countTweet = 0; countTweet < myTweets.size(); countTweet++){
            if (myTweets.get(countTweet).contains("hackerrank")){
                ++tweetCount;
            }
        }
        System.out.println(tweetCount);
        input.close();
   }
 }