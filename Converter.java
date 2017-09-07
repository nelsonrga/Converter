// exercise 6.35 Computer instruction
import java.util.Scanner;
import java.security.SecureRandom;
public class Converter
{
	static Scanner input;
	static SecureRandom random;
	static int userResponse;
	static int answer;


	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		random = new SecureRandom();
		while (true)
		{
			generateQuestion();
			while(answer != userResponse)
			{
				System.out.println("Not correct, try again");
				userResponse = input.nextInt();
			}
			System.out.println("Correct. Here is another");
		}
	} // end main
public static void generateQuestion()
{
	int firstNum;
	int secondNum;
	firstNum = random.nextInt(6);
	secondNum = random.nextInt(6);
	answer = firstNum * secondNum;
	System.out.println("What is " + firstNum + " times " + secondNum);
		userResponse = input.nextInt();
	}

}