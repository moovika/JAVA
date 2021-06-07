package lab1;

public class SwapTwoNumbers {
	public static void main(String[] args) {
int first = 120, second= 220 ;
System.out.println("--Before Swap-- ");
System.out. println("First number = " + first);
System.out.println("second number = " + second); 
// value of first is assigned to temporary
float temporary = first;
//value of second is assigned to first
first =second;
//value of temporary (which contains the initial value of first )is assigned to second
second = (int) temporary;
System.out.println("--after Swap-- ");
System.out. println("First number = " + first);
System.out.println("second number = " + second); 
	}
}
