//Aubrey Sullivan
import java.util.Scanner;

public class CoffeeTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean coutiunedProgram = true;
		
		while(coutiunedProgram)
		{
			Coffee coffee1 = new Coffee ();
			Coffee coffee2 = new Coffee();
			
			//first coffee
			System.out.println("This is Coffee time");
			System.out.println("What is the first coffe?");
			coffee1.setName(scanner.nextLine());
			//content
			System.out.print("What is the Caffeine content?");
			int caffeine1 = scanner.nextInt ();
			coffee1.SetCaffeineContent(caffeine1);
		
			System.out.println(coffee1);
			System.out.printf("%.1f cups of %s is a dangerous amount to have .\n",coffee1.riskyAmount(), coffee1.getName());
			//second coffee
			System.out.println("What is the second coffee?");
			coffee2.setName(scanner.nextLine());
			//content
			System.out.println("What is the Caffeine content?");
			int caffeine2 = scanner.nextInt ();
			coffee1.SetCaffeineContent(caffeine2);
			
			System.out.println(coffee2);
			System.out.printf("%.1f cups of %s is a dangerous amount to have .\n",coffee2.riskyAmount(), coffee2.getName());
			
			
			//equals parts 
			System.out.println("Are the coffes equal:"+ coffee1.equals(coffee2));
			
			System.out.print("Do you wish to countiune? Enter Yes or No:");
			String userResponse = scanner.nextLine();
			coutiunedProgram = userResponse.equalsIgnoreCase("yes");
			
		}
		//close 
scanner.close();
	}

}
