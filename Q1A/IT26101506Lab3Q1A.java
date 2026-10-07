import java.util.Scanner;

public class IT26101506Lab3Q1A {
	
	public static void main(String[] args){
		
		double pricePerKg , quantity , totalAmount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice: ");
		pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of Kilogrames you want to buy: ");
		quantity = input.nextDouble();
		
		totalAmount = pricePerKg * quantity;
		
		System.out.println();
		System.out.println("The total amount is: " + totalAmount);
	}
}
		
		
		
		
		