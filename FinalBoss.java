package testing;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * Date: January 20, 2016 
 * Course Code: ICS 3U1-01 
 * Title: Final boss
 * 
 * Description: This method holds the instance variables of the final boss in the game.
 * 
 * @author Aalea Ally
 * 
 */ 
public class FinalBoss extends Mover {

	/**
	 * holds defense power of boss
	 */ 
	private static int bossDefensePower;

	/**
	 * creates an array of ImageIcons representing various states of the boss
	 */
	public ImageIcon[][] sprite = 
				//0 walking forward
			{{ new ImageIcon("sprites/MarioStanding.PNG")},
				//1 punch
				{ new ImageIcon("sprites/MarioPunch3.PNG")},
				//2 jump
				{ new ImageIcon("sprites/MarioJump.PNG")},
				//3 spin jump
				{ new ImageIcon("sprites/")},
				//4 crouch
				{ new ImageIcon("sprites/MarioCrouching1.PNG")},
		};

	/**
	 * Boss constructor
	 */
	public FinalBoss() {

		this.setHealthPoints(50); //sets health points to 50
		
		//resizes the boss standing right imageicon so that it can fit in the room
		Image image = sprite[0][0].getImage(); //convert imageicon to image
		Image fixedImage = image.getScaledInstance(19, 19, java.awt.Image.SCALE_SMOOTH); //scale image
		sprite[0][0] = new ImageIcon(fixedImage); //changes imageicon to scaled image
		
		//resizes the boss jumping for the final battle
		image = sprite[2][0].getImage(); //convert imageicon to image
		fixedImage = image.getScaledInstance(125, 220, java.awt.Image.SCALE_SMOOTH); //scale image
		sprite[2][0] = new ImageIcon(fixedImage); //changes imageicon to scaled image

		this.setIcon(sprite[0][0]); //set boss to standing left on the screen when game starts
	}

	public static int getBossDefensePower() {
		return bossDefensePower;
	}

	public void setBossDefensePower(int bossDefensePower) {
		FinalBoss.bossDefensePower = bossDefensePower;
	}


}
