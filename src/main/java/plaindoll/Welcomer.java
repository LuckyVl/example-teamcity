package plaindoll;

public class Welcomer{
	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}
	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}
	public String sayNeedGold(){
		return "Not enough gold";
	}
	public String saySome(){
		return "something in the way";
	}
    public String getHunterReply() {
        String[] replies = {
            "The hunter stalks silently through the night.",
            "Only a true hunter knows the way.",
            "hunter mode: activated",
            "Every hunter needs a good weapon.",
            "A wise hunter prepares before the hunt."
        };
        return replies[new java.util.Random().nextInt(replies.length)];
    }
}
