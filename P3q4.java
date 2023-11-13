import java.util.Scanner;
public class P3q4{
	public static void main(String[]args){
		Scanner weight = new Scanner(System.in);
		System.out.print("Enter weight : ");
		double Weight = weight.nextDouble();
		
		Scanner height = new Scanner(System.in);
		System.out.print("Enter height : ");
		double Height = height.nextDouble();
		
		double bmi = Weight / (Height*Height);
		System.out.print( "BMI VALUE = "+(bmi));
	}
}