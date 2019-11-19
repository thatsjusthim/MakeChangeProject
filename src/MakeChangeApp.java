
public class MakeChangeApp {

	static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		

		double quarters = .25, dimes = .10, nickels = .05, pennies = .01, twenty = 20.0, ten = 10.0, 
				five = 5.0, one = 1.0, cost = 0.0, payment = 0.0; 
		
		
		
		System.out.println("Enter the amount of money charged for the product: ");
		cost = scanner.nextDouble();

		System.out.println("Enter the amount of money received for the product: ");
		payment = scanner.nextDouble();
		
		if(payment < cost) {
		System.out.println("This payment doesn't cover the purchase price. ");
		}
		else if(payment == cost) {
		System.out.println("Thank you for providing exact payment! There is no change due. ");
		}
		
		if(payment > cost) {
			System.out.println("You are owed $" + (payment - cost) + " in change! ");
		}
		double changeOwed = payment - cost;
		
		System.out.println(changeOwed);
		
		double changeRemaining = (changeOwed % 20.0);
		
		
		changeRemaining = (changeOwed % 10.0);
		
		changeRemaining = (changeRemaining % 5.0);
		
		changeRemaining = (changeRemaining % 1.0);
		
		changeRemaining = (changeRemaining % .25);
		
		changeRemaining = (changeRemaining % .10);
		
		changeRemaining = (changeRemaining % .05);
		
		changeRemaining = (changeRemaining % .01);
		
		System.out.println(changeRemaining);
	} 
		
}
