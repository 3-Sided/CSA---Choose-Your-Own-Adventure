public class CYOALogic {
	
	private String playerName;
	
	public CYOALogic(String name) {
		playerName = name;
	}
	
	public String getName() {
		return playerName;
	}
	
	public String intro() {
		return "Greetings, " + this.getName() + "! Imagine you are a brave adventurer, leaving their homewton to pursue fame, riches, and other things that people\nwould go on quests for. You have been traveling on your quests for a few days now, and are still driven by your original passion for adventure. After a long day of walking on the road, you find a nice forest clearing to take a rest for the night. You light a fire, have a hard dinner of dried meat and bread, and settle in for the rest of the night."; 
	}
	
	public String scenario1() {
		return "\nHowever, right as you are about to fall asleep, you see in the light of the fire a bear rushes out of the trees and attacks!\n(Type 1, 2, 3, or 4 for a result):";
	}
	
	public String option1a(){
		return "\nYou swing your sword at the bear’s stomach, slicing it open and covering your sword with blood. The bear looks very weak after the blood loss, \nbut is not quite dead yet.\n";
	}
	
	public String option1b(){
		return "\nYou are frozen, paralyzed with fear as the bear stands up on its hind legs, and cleaves your head clean off your shoulders. It roars with triumph and\nbegins to feast on your corpse. With no one to remember you, or to recover your remains, your death marks the end of your legacy.\n";
	}

	public String option1c(){
		return "\nYou cast a fireball at the bear, setting it ablaze in an instant. The bear begins to thrash about as it attempts to escape the fire, but it seems\nyou have only angered it further.\n";
	}

	public String option1d(){
		return "\nYou grab one of the flaming logs from the fire, and wave it back and forth in an attempt to scare the bear away. The bear growls as it recoils\nfrom the fire, but is still intent on killing you.\n";
	}
	
	public String scenario2() {
		return "\nThe bear looks discouraged after the initial scuffle, and one more blow should finish it off. At this point you are feeling confident that you\ncan beat this bear, and may try to show off a little as you finish this leg of your adventure. (Type 1, 2, 3, or 4 for a result):\n";
	}
	
	public String option2a() {
		return "\nYou attempt to swing your sword again at the bear to finish it off, but miss completely and trip over your own feet. You fall and hit your head\non a sharp rock, immediately knocking yourself unconscious and will eventually die from the massive blood loss, if the bear doesn't get you first.\n";
	}
	
	public String option2b() {
		return "\nYou try to set the bear on fire again with a spell, however as the fireball leaves your hand you realize the bear is nearly on top of you. The\nexplosion of the fireball hits both you and the bear, setting both ablaze, and eventually causing your demise after what feels like years of pain. Passerbys eventually find your charred corpse, but with no way to identify you, your legend dies with you.\n";
	}
	
	public String option2c() {
		return "\nDespite having gained a leg up on the bear, you have a sudden flash of fear and realize that his was a stupid idea in the first place. You take\noff as fast as you can, heading back to the main road and eventually your home where you live the rest of your days as a farmer, reminiscing about how you missed your chance for fame and fortune for a boring and meaningless life.\n";
	}
	
	public String option2d() {
		return "\nYou run towards the bear, sliding under its legs as you cut both of its knee ligaments. As the bear falls to the ground, you immediately\ntransition your momentum from sliding into a backflip, thrusting your sword into the back of the bear's neck as you land, killing it instantly.\nYou continue your adventure, eventually becoming the most famous and legendary hero of the era.\n";
	}

}
