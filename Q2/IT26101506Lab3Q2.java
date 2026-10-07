import java.util.Scanner;

public class IT26101506Lab3Q2 {
	public static void main(String[] args){
		double monthlySalary , OThour , OThourRate , OTAmount , totalSalary;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary:" );
		monthlySalary =  input.nextDouble();
		
		System.out.print("Enter the number of OT hours:" );
		OThour = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate:" );
		OThourRate = input.nextDouble();
		
		OTAmount = OThour * OThourRate;
		totalSalary = monthlySalary + OTAmount;
		
		System.out.println();
		System.out.println("The total salary including OT is : " + totalSalary);
	}
}
		
		