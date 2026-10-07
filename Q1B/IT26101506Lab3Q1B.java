import java.util.Scanner;

public class IT26101506Lab3Q1B {
	public static void main(String[] args){
		
		double pricePerKg , quantity , totalAmount , discount , finalAmount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice:" );
		pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of kilo0gram you want to buy;" );
		quantity = input.nextDouble();
		
		totalAmount = pricePerKg * quantity;
		discount = pricePerKg * quantity * 10/100;
		finalAmount = totalAmount - discount;
		
		System.out.println();
		System.out.println("The final amount is: " + finalAmount);
	}
}
	
		
		
		