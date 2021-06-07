package lab1;
import java.util.Scanner;
public class FactorialDemo {
	public static void main(String[] args) {
	//Scanner object for capturing the user input
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		//stored the entered value in variable
		int num = Scanner.nextInt();
		//Called the user defined function fact
		int factorial = fact(num);
		System.out.println("Factorial of entered number is:"+factorial);
	}
	static int fact(int n)
	{
		int output;
		if(n==1) {
			return 1;
		}
		//Recursion: Function calling itself!!
		output = fact(n-1) * n;
		return output;
		}
	}

