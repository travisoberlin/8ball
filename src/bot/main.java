package bot;

import java.util.Random;
import java.util.Scanner;

public class main
{
	public static void main ( String[] args ) {
	Scanner userInput = new 
	Scanner(System.in);
	System.out.println("What would you like to ask the Magic 8 Ball?");
	String question = userInput.nextLine();
	System.out.println(question);
		new EightBall();
		
		
	}
}