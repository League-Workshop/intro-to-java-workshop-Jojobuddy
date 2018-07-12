package section4;
import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {   //this line of code keeps the battle going until someone's health reaches 0 
		
			
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		Random factory = new Random();
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
			String answer = showInputDialog("kick or yell at the dragon?");
		// 9. If they typed in "yell":
			if (answer.equals("yell")) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
		if(	factory.nextBoolean())
				dragonDamage = factory.nextInt(9);
		else dragonDamage = 32;
			//-- Subtract that number from the dragon's health variable 
			dragonHealth -= dragonDamage;
			}
		// 10. If they typed in "kick":
			if (answer.equals("kick")) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
				dragonDamage = factory.nextInt(31);
			//-- Subtract that number from the dragon's health variable
			dragonHealth -= dragonDamage;
			}
			
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		playerDamage = factory.nextInt(36);
		// 12. Subtract this number from the player's health
		playerHealth -= playerDamage;
		
		if (answer.equals("meow")) {
			dragonDamage = 100;
			dragonHealth -= dragonDamage;
		}
		
		if (answer.equals("memes")) {
			playerDamage = 100;
					playerHealth -=playerDamage;
		}
		
		// 13. If the user's health is less than or equal to 0
		if( playerHealth < 1) showMessageDialog(null, "Game over man, game over.");
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		else if(dragonHealth < 1) showMessageDialog(null, "You won yay you just bulied an inicent little dragon to death how do you feel");
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		else showMessageDialog(null, "Dragons Health - "+dragonHealth +" Dragons Damage - "+playerDamage+ "    Your Health - "+playerHealth+" Your Damage - "+dragonDamage);
		}
	}
}
	
