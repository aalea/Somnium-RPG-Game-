package testing;

import java.util.Arrays;

import javax.swing.JOptionPane;


/**
 * Date: January 20, 2016 
 * Course Code: ICS 3U1-01 
 * Title: Paper
 * 
 * Description: This class uses the Loader class to assign in messages and positions from a database
 * It stores the instance variables of each of the pages scattered around the rooms. 
 * 
 * @author Aalea Ally
 * 
 */
 
public class Paper {
    
    /**
     * holds message of paper
     */ 
    private String message; 
    
    /**
     * holds position of paper
     */
    private int[] position = new int[3]; //position[room number][x position][y position]
    
    /**
     * determines if the user viewed the message or not
     */
    private boolean wasRead;
     
     /**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	

	/**
	 * @return the position
	 */
	public int[] getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int[] position) {
		this.position = position;
	}

	/**
	 * @return if the meassage was read
	 */
	public boolean isWasRead() {
		return wasRead;
	}

	/**
	 * @param change if the message was viewed or not
	 */
	public void setWasRead(boolean wasRead) {
		this.wasRead = wasRead;
	}

}
