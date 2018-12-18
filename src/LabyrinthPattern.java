import java.util.Random;

/**
 * 
 */

/**
 * @author dell
 *
 */
public class LabyrinthPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int line = 0; line < 60; line++) {
			for (int i = 0; i < 30; i++) {

				//Random rand = new Random();
				//int value = rand.nextInt(2);
				float value =(float) (Math.floor((Math.random()*2)%2));
				if (value == 1) {
					System.out.print("╱");
				} else {
					System.out.print("╲");
				}

			}
			System.out.println("");

		}

		//(Math.floor((Math.random()*2)%2))
	System.out.println(""+Math.floor((Math.random()*2))%2);
	}

}
