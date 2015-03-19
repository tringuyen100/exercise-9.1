import java.util.Scanner;


public class userrole {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Please enter your role");
		String input = keyboard.next();
		
		
		
		
		 switch(input) {
		 case "admin":
			 System.out.println("Welcome Admin!");
			 break;
		 case "faculty":
			 System.out.println("Welcome Faculty!");
			 break;
		 case "staff":
			 System.out.println("Welcome Staff!");
			 break;
		 case "student":
			 System.out.println("Welcome Student!");
			 break;
		 case "guess":
			 System.out.println("Welcome Guess!");
			 break;
		 default:
			 System.out.println("Your input is incorrect");
			
		}
	}
}
