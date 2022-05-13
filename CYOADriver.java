import java.util.*;

public class CYOADriver {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

	boolean dead = false;
	
	while (dead == false) {
	System.out.print("Please enter player name: ");
	String playerName = input.nextLine();
	CYOALogic p1 = new CYOALogic(playerName);
	
	System.out.println(p1.intro());
	System.out.print(p1.scenario1());
	System.out.print(" (Or type 0 to quit)");
	
	int choice = input.nextInt();
	
	if (choice == 1) {
		System.out.print(p1.option1a());
	} else if (choice == 2) {
		System.out.print(p1.option1b());
		dead = true;
	} else if (choice == 3) {
		System.out.print(p1.option1c());
	} else if (choice == 4) {
		System.out.print(p1.option1d());
	} else {
		break;
	}
	
	if (dead == false) {
		
		System.out.print(p1.scenario2());
		System.out.print("(Or type 0 to quit)");
		
		int choice2 = input.nextInt();
		
		if (choice2 == 1) {
			System.out.print(p1.option2a());
			dead = true;
		} else if (choice2 == 2) {
			System.out.print(p1.option2b());
			dead = true;
		} else if (choice2 == 3) {
			System.out.print(p1.option2c());
			dead = true;
		} else if (choice2 == 4) {
			System.out.print(p1.option2d());
			dead = true;
		} else {
			break;
		}
	}
	
	System.out.print("\nPlay again? (Type 0 to play again, any number to stop)");
	int again = input.nextInt();
	if (again == 0) {
		dead = false;
	}
	
	}
	input.close();
	System.out.print("\nThanks for playing");
	
	}
}
