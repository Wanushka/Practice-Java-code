import java.util.Scanner;
public class P3q2{
	public static void main(String[]args){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter decimal Number: ");
		int number = num.nextInt();
		System.out.print(Integer.toBinaryString(number));
	}
}