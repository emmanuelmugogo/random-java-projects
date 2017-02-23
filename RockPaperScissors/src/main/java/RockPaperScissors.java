import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		int userPick = 0, computerPick, numOfRounds, userWins = 0, computerWins = 0, ties = 0, roundCounter = 1;
		String [] options = {"Rock", "Paper", "Scissors"};
		String userChoice = "", computerChoice;
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Welcome to RPS Game");
		
		System.out.println("How many Rounds would you like to play");
		numOfRounds = scanner.nextInt();
		
		if (numOfRounds >= 1 && numOfRounds <= 10) {
			
			for (int i = 0; i < numOfRounds; i++) {
				
				System.out.println("\n\nROUND Number " + roundCounter);
				System.out.println("please pick your choice from the options below"
						+ "\n\t1 - Rock\n\t2 - Paper\n\t3 - Scissors");
					userPick = scanner.nextInt();
					userChoice = options[userPick - 1];
					
					//this tracks the computer choice
					computerPick = random.nextInt(3) + 1;
					computerChoice = options[computerPick - 1];
					
					System.out.println("user choice is " + userChoice + " computer choice is " + computerChoice);
					
					if(computerChoice.equals(userChoice)) {
						System.out.println("Computer Picked " + computerChoice + " too The game is TIE");
						ties++;
					}else if(computerChoice.equals("Rock") && userChoice.equals("Scissors")) {
						System.out.println("Computer picked " + computerChoice + " Computer WINS");
						computerWins++;
					}else if(userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
						System.out.println("Computer picked " + computerChoice + " You WIN");
						userWins++;
					}else if (computerChoice.equals("Scissors") && userChoice.equals("Paper")) {
						System.out.println("Computer picked " + computerChoice + " Computer WINS");
						computerWins++;
					}else if(userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
						System.out.println("Computer picked " + computerChoice + " You WIN");
						userWins++;
					}else if (computerChoice.equals("Paper") && userChoice.equals("Rock")) {
						System.out.println("Computer picked " + computerChoice + " Computer WINS");
						computerWins++;
					}else if(userChoice.equals("Paper") && computerChoice.equals("Rock")) {
						System.out.println("Computer picked " + computerChoice + " You WIN");
						userWins++;
					}
					
					roundCounter++;
				
			}//end of for loop
			
			
			System.out.println("\n\nTotal results \n\t user wins " + userWins + "\n\t computer wins " + computerWins + "\n\t Ties " + ties + "\n\n" );
			
			if(userWins > computerWins) {
				System.out.println("You are the Winner");
			}else if (computerWins > userWins) {
				System.out.println("Computer Won");
			}else {
				System.out.println("The Game was TIE");
			}
			
		}else 
			System.out.println("You are supposed to put round between 1 and 10");
	
		scanner.close();

	}

}
