package testing;


/**
 * Date: January 20, 2016 
 * Course Code: ICS 3U1-01 
 * Title: RPG Game Test (the main class) 
 * 
 * Description: This is the class that executes first. It calls the necessary classes 
 * to start the game. It creates an object array for the paper messages, creates a FrameSetup
 * object, calls the FrameSetup class, calls the Loader class to play the intro music, and calls the Loader class
 * to load in the CSV file of messages into the object array for the paper messages.
 * 
 * 								THERE IS A HEADER IN EACH CLASS
 * 
 * Areas of Concern: Because having both a new static FrameSetup object being created, and then just 
 * a new FrameSetup statement in the main method, two frames show up. But removing either causes
 * complications later in the code (refering to FrameSetup, etc)
 * 
 * @author Aalea Ally
 *
 */
public class RPGGameTest {
	
	
	//static Protagonist p = new Protagonist(); 
	//static FinalBoss b = new FinalBoss(); 
	
	/**
	 * the paper object array which holds the attributes of the pages scattered across the rooms
	 */
	static Paper [] paper = new Paper[15]; 

	/**
	 * the first frame that pops up. It holds the intro screen and the rooms.
	 */
	static FrameSetup frame = new FrameSetup();
	
	public static void main (String[] args) {
		
		// starts new instance of the class that setups the frame
		new FrameSetup(); 
		//play intro music in the loader class
		Loader.audioLoader("Intro Music", "sounds/music/intro.wav");
		//start loading attributes of paper object elements in the array
		new Loader(paper);
		
		//new Ending(p, b);
		
	}

}
