import java.util.Random;
import java.util.Scanner;

public class LuckySevens {

	public static void main(String[] args) {
		
		int rolls = 0, maxRoll = 0, rollOut;
		Double maxBet = 0.0, bet;
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Lucky Sevens Game\nHow many Dollars do you want to BET?");
		bet = scanner.nextDouble();
		

		
		while(bet > 0) {
//			Dice Roll
			int dice1Roll = random.nextInt(6) + 1;
			int dice2Roll = random.nextInt(6) + 1;
			 
			rollOut = (dice1Roll + dice2Roll);
			
			if (rollOut == 7) {
				bet += 4.0;
			}else {
				bet -= 1.0;
			}
//tracks number of rolls
			rolls++;

//this tracks max Bet
			if (bet >= maxBet){
				maxBet = bet;
				maxRoll = rolls;
				
			}
			
		}
		
		System.out.println("You are block after " + rolls + " rolls \nYou should have quit after " + maxRoll + " rolls \nWhen you had $ " + maxBet);
		
		

	}
	
	

}
