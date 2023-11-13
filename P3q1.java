import java.util.Scanner;
public class P3q1{
	public static void main(String[]args){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter Number: ");
	double number = num.nextDouble();
	System.out.print(check(number));
	}
	
	public static String check(double num){ 
		if(num<0){
			return "Negative";
		}else{
			return "positive";
		}

	}
}
	
