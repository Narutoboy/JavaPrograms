import java.util.Scanner;

/**
 * 
 */

/**
 * @author akshay sharma
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		// check if no is even or not
		if (num % 2 == 0) {
			System.out.println("no is even");
		} else {
			System.out.println("Enter number is odd " + num);
		}
	}
}