import java.util.Scanner;
public class P3q3{
	public static void main(String[]args){
		Scanner num = new Scanner(System.in);
		System.out.print("Inches Value: ");
		double number = num.nextDouble();
		double meters= number/39.37;
		System.out.print((meters)+"Meters");
	}
}