import java.util.Scanner;
public class HomeworkGame {

	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		
		String contestant1Prize = "nothing";
		String contestant2Prize ="nothing";

		String pinkPrize="Pink diamond";
		String bluePrize="Blue diamond";
		String greenPrize="Green diamond";
		String purplePrize="Purple diamond";
		String orangePrize="Orange diamond";
		String redPrize="Red diamond";
		String yellowPrize="Yellow diamond";
		String whitePrize="White diamond";
		String blackPrize="Black diamond";
		
		System.out.println("Welcome!");
		System.out.println("Contestant 1: The wizard will give you a white diamond. Would you like to keep it or trade it for a another diamond. Enter \"Keep\", \"Trade\" or \"Steal\":");
		
		String firstChoice = key.nextLine();
		
		 if (firstChoice.equalsIgnoreCase("keep")) 
		 {
	            contestant1Prize = whitePrize;
	            contestant2Turn(key, contestant1Prize);
	        } 
		 else if (firstChoice.equalsIgnoreCase("trade")) 
		 {
	            contestant1Prize = tradeDiamond(key);
	            contestant2Turn(key, contestant1Prize);
	        } 
		 else if (firstChoice.equalsIgnoreCase("steal"))
	        
	        {
	            contestant1Prize = stealDiamond(key);
	            contestant2Turn(key, contestant1Prize);
	        } 
		 else {
	            System.out.println("Invalid choice. Exiting the program!");
	            System.exit(0);
	        }
	    }

	    public static void contestant2Turn(Scanner key, String contestant1Prize) {
	        System.out.println("Contestant 2: You have the option to steal the diamond or buy another diamond. Enter \"Steal\" or \"Buy\":");
	        String secondChoice = key.nextLine();

	        if (secondChoice.equalsIgnoreCase("steal")) 
	        {
	            System.out.println("Contestant 2 stole the diamond! Contestant 1 is left with nothing!");
	        } 
	        else if (secondChoice.equalsIgnoreCase("buy")) 
	        {
	            String newPrize = buyDiamond(key);
	            System.out.println("Contestant 2 bought a " + newPrize + ".");
	        } 
	        else {
	            System.out.println("Invalid choice. Please restart the game.");
	        }
	    }

	    public static String tradeDiamond(Scanner key) {
	        System.out.println("You can trade the White diamond for a Pink, Blue, or Green diamond. Which one do you want? Enter \"Pink\", \"Blue\", or \"Green\":");
	        String tradeChoice = key.nextLine();

	        switch (tradeChoice.toLowerCase()) {
	            case "pink":
	                return "Pink diamond";
	            case "blue":
	                return "Blue diamond";
	            case "green":
	                return "Green diamond";
	            default:
	                System.out.println("Invalid trade choice. You keep the White diamond.");
	                return "White diamond";
	        }
	    }

	    public static String stealDiamond(Scanner key) {
	        System.out.println("You have the chance to steal any diamond. Which one do you want to steal? Enter \"Pink\", \"Blue\", \"Green\", or \"White\":");
	        String stealChoice = key.nextLine();

	        switch (stealChoice.toLowerCase()) {
	            case "pink":
	            case "blue":
	            case "green":
	            case "white":
	                return stealChoice.substring(0, 1).toUpperCase() + stealChoice.substring(1).toLowerCase() + " diamond";
	            default:
	                System.out.println("Invalid steal choice. You keep the White diamond.");
	                return "White diamond";
	        }
	    }

	    public static String buyDiamond(Scanner key) {
	        System.out.println("You can buy any diamond: Pink, Blue, Green, Purple, or Orange. Which one do you want? Enter your choice:");
	        String buyChoice = key.nextLine();

	        switch (buyChoice.toLowerCase()) {
	            case "pink":
	                return "Pink diamond";
	            case "blue":
	                return "Blue diamond";
	            case "green":
	                return "Green diamond";
	            case "purple":
	                return "Purple diamond";
	            case "orange":
	                return "Orange diamond";
	            default:
	                System.out.println("Invalid buy choice. You end up with nothing.");
	                return "nothing";
	        }
	    }
	
	
	}


