import java.util.Scanner;
public class Television {
    
    private int channelId, volume;
    private boolean isTvOn;
    public static void main(String[] args) {
        Television on = new Television();

        //on.changeChannel(2));
        on.changeChannelByNumber(1);       
    }
    Scanner setTv = new Scanner(System.in);
    public void setTvOn () {
        isTvOn = true;
    }
    public void setTvOff () {
        isTvOn = false;
    }
    
    public void changeChannelByNumber(int channelId) {
        
        if (isTvOn) {
            System.out.println("Enter Any Channel Number From 1 to 10: ");
            int channelNumber = setTv.nextInt();
            
            channelId = channelNumber;
        }
        
        String newChannelId = (channelId == 1) ? "NTA" : (channelId == 2) ? "CHANNELS TV" : (channelId == 3) ? "AIT" : (channelId == 3) ? "STV" : (channelId == 4) ? "AFRICA MAGIC" : (channelId == 5) ? "ROK3" : (channelId == 6) ? "MOVIES ZONE" : (channelId == 7) ? "FOX TV" : (channelId == 8) ? "CNN" : (channelId == 9) ? "BBC" : (channelId == 10) ? "AL JAZEERA" : "Channel Number Not Available";
        System.out.print("You're now watching: " + newChannelId);
    }
    public void changeChannelByNavigation(int channelId) {
        channelId++;
    }
}