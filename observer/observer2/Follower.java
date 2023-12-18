public class Follower implements Observer{
    private String followerName;

    @Override
    public void update(String status) {
        System.out.println(followerName + " received an update: " + status);
    }
    public void play() {
        System.out.println("Channel playing.");
    }
}
