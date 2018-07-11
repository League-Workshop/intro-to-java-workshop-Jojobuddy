package section3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Snooper {
public static void main(String[] args) {
	String name = showInputDialog("What is your name?");
	showMessageDialog(null, "hi "+name);
	String adress = showInputDialog("What is your adress");
	showInputDialog("what is your credit card number");
	String murder = showInputDialog("How would you like to die");
	String item = showInputDialog("what is your most valuable house item");
	showMessageDialog(null,"I'm going to go to wher you live, "+adress+", your going to "+murder+" and I'm going to steal your "+item+" and credit card.");
}
}
