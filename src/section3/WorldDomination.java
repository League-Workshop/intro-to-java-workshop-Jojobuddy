package section3;

import static javax.swing.JOptionPane.showInputDialog;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = showInputDialog("do u no how too rite code");
		// 2. If they say "yes", tell them they will rule the world.
if (answer.equals("yes"))showInputDialog("Then you cood rule da world, or do nothing");
		// 3. Otherwise, wish them good luck washing dishes.
if (answer.equals("no"))showInputDialog("get off yo butt and learn");
	}
}

