package lab1;

public class FindLcm {
public static void main(String[] args) {
	int n1 = 72, n2 = 120, lcm;
	// maximum number between n1 and n2 is stored in 1cm
	lcm = (n1 > n2) ? n1 : n2;
	// Always true
	while(true) {
		if( lcm % n1 == 0 && lcm % n2 == 0 ) {
          System.out.printf("The LCM of %d and %d is %d.", n1,n2, lcm);
               break;
		}
		++lcm;
	}
}
}
