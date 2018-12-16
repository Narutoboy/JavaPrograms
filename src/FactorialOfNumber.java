import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int number, fact=1;
		System.out.println("Enter a Number");
		//for taking number for user 
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		if (number > 0) {
			for (int i = 1; i <= number; i++) {
				fact=fact*i;
				
				//System.out.println("factorial "+fact);
				
			}
			System.out.println("factorial of number"+number+"is "+fact);		
		}

		scan.close();
	}
}
/**
factorial 5 
5*4*3*2*1



5*1 	 5
5*2		10	
10*3	30	
30*4	120


*/