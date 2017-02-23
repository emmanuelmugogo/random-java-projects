import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		Double interestRate, principal, interestEarned, compoundInterest = 0.0, beginPrincipal;
		int numOfYears, year = 0, userChoice, periods = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much Money would you like to put as principal?");
		principal = scanner.nextDouble();
		
		System.out.println("How many years you want your money to stay in?");
		numOfYears = scanner.nextInt();
		
		System.out.println("Put the interest Rate");
		interestRate = scanner.nextDouble();
		
		System.out.println("How many times would you like your interest to compound?");
		System.out.println("Please select\n\t1 - quarterly\n\t2 - monthly\n\t3 - daily");
		userChoice = scanner.nextInt();
		
		if (userChoice == 1) {
			periods = 4;
			compoundInterest = interestRate/periods; 
		}else if (userChoice == 2) {
			periods = 12;
			compoundInterest = interestRate/periods;
		}else if (userChoice == 3) {
			periods = 365;
			compoundInterest = interestRate/periods;
		}else {
			System.out.println("invalid Selection, Bye");
		}
		
		for (int i = 0; i < numOfYears ; i++) { //gets the results after every year
			beginPrincipal = principal;
			
			for (int j = 0; j < periods; j++) { //gets the results after every quarter
				principal = principal * (1 + (compoundInterest/100));
				
			}
			year++;
			interestEarned = principal - beginPrincipal;
			
			System.out.println("\nYear number " + year);
			System.out.println("The principal at the begining of the year was " + Math.round(beginPrincipal));
			System.out.println("The total Interest earned for this year is " + Math.round(interestEarned));
			System.out.println("The principal at the end of the year is " + Math.round(principal));
		}
		
		scanner.close();
	}

}
