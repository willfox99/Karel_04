/**
*
* Creates a group of Athletes and directs them to positions on the field
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {
	
	public static void takeTheField(Athlete arg) {
		arg.move();
		arg.move();
		arg.move();
		arg.move();
		arg.turnRight();
		arg.move();
		arg.move();
	}

     public static void main(String[] args) {
          // TODO Your code goes here
     }
}
