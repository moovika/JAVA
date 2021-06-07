package lab1;
import java.util.Scanner;
public class ReverseNumberWhile {
	public static void main(String[] args)
	{
		int num=0;
		int reversenum =0;
		System.out.println("input your number and press enter:");
		//This statement will capture the user input
		Scanner in = new Scanner(System.in);
		//captured input would be stored in number num
		num = in.nextInt();
		//while Loop: Logic to find out the reverse number
		while( num !=0 )
		{
			reversenum = reversenum * 10;
			reversenum = reversenum + num%10;
			num = num/10;
	}
	System.out.println("Reverse of input number is:"+reversenum);
	}
}
