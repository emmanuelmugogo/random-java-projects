import java.util.Scanner;

public class Factorizer {

	public static void main(String[] args) {

		int num, sum = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the number to factorize.");
		num = scanner.nextInt();
		
		System.out.println("The factors of " + num + " are...");

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				sum += i;
			}

		}
//		System.out.println("the total of factors is " + sum);

		if (sum == num) {
			System.out.println("this is a perfect number");
		} else if (sum != num) {
			System.out.println(num + " is not a perfect number");
		}

		if (sum == 1) {
			System.out.println(num + " is a prime number");
		}
		scanner.close();
	}

}
