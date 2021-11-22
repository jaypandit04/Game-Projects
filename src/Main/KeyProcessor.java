/* This will handle the "Hot Key" system. */

package Main;

import Data.Vector2D;
import logic.Control;
import timer.stopWatchX;

public class KeyProcessor{
	// Static Fields
	private static char last = ' ';			// For debouncing purposes
	private static stopWatchX sw = new stopWatchX(250);
	
	// Static Method(s)
	public static void processKey(char key){
		if(key == ' ')				return;
		// Debounce routine below...
		if(key == last)
			if(sw.isTimeUp() == false)			return;
		last = key;
		sw.resetWatch();
		
		/* TODO: You can modify values below here! */
		Vector2D leftVector = null;
		switch(key){
		case '%':								// ESC key
			System.exit(0);
			break;

			case 't':
				Main.trigger = "t is triggered";
				break;

			case '$':
				Main.trigger = "action key is triggered";
				if(Main.currentVec.getY() - 10 == 230 &&  Main.currentVec.getX() + 10 > 1150)
					Main.trigger = "Welcome to home, get some rest";

				if(Main.currentVec.getY() - 10 == 190 && Main.currentVec.getX() - 10 < 380)
					Main.trigger = "Welcome to the Energy Restaurant";

				break;

			case 'w':
				Main.trigger = "Up key is triggered";
				if(Main.currentVec.getY() - 10 > 90) {
					if(Main.currentVec.getY() - 10 == 230 && Main.currentVec.getX() + 10 > 1200) {
						Main.trigger = "COLLISION";
						break;
					}

					if(Main.currentVec.getY() - 10 == 190 && Main.currentVec.getX() - 10 < 380) {
						Main.trigger = "COLLISION";
						break;
					}
					Main.currentVec = new Vector2D(Main.currentVec.getX(), Main.currentVec.getY() - 10);

					Main.vecs1.add(Main.currentVec);
				}

				if(Main.currentVec.getY() - 10 == 90)
					Main.trigger = "object is collided at top side";

				break;

			case 'a':
				Main.trigger = "left key is triggered";
				if(Main.currentVec.getX() - 10 > 230) {
					if (Main.currentVec.getY() - 10 < 190 && Main.currentVec.getX() - 10 < 400) {
						Main.trigger = "COLLISION";
						break;
				   }
					Main.currentVec = new Vector2D(Main.currentVec.getX() - 10, Main.currentVec.getY());

					Main.vecs1.add(Main.currentVec);
				}

				if(Main.currentVec.getX()-10 == 230)
					Main.trigger = "object is collided at left side";

				break;

			case 's':
				Main.trigger = "down key is triggered";
				if(Main.currentVec.getY() + 10 < 700) {
					Main.currentVec = new Vector2D(Main.currentVec.getX(), Main.currentVec.getY() + 10);

					Main.vecs1.add(Main.currentVec);
				}
				if(Main.currentVec.getY() + 10 > 690)
					Main.trigger = "object is collided at bottom";

				break;

			case 'd':
				Main.trigger = "right key is triggered";
				if(Main.currentVec.getX() + 10 < 1300) {
					if(Main.currentVec.getY() - 10 < 230 &&  Main.currentVec.getX() + 10 > 1150) {
						Main.trigger = "COLLISION";
						break;
					}
					Main.currentVec = new Vector2D(Main.currentVec.getX() + 10, Main.currentVec.getY());

					Main.vecs1.add(Main.currentVec);
				}

				if(Main.currentVec.getX() + 10 == 1300)
					Main.trigger = "object is collided at right side";

				break;
			
		case 'm':
			// For mouse coordinates
			Control.isMouseCoordsDisplayed = !Control.isMouseCoordsDisplayed;
			break;
		}
	}
}