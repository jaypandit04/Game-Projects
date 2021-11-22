package Main;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.sql.Array;
import java.util.*;


import Data.Vector2D;
import Data.Wall;
import Data.spriteInfo;
import FileIO.EZFileRead;
import logic.Control;
import timer.stopWatchX;

public class Main{
	// Fields (Static) below...
	public static Color c = new Color(255,255,255);
	public static Color c1 = new Color(0,0,0);
	public static boolean isImageDrawn=false;
	public static stopWatchX timer = new stopWatchX(50);

	public static String trigger ="";
	public static String info1="Welcome to Flying Man Game"+" There are two places you can visit";
	public static String info2=" 1) Home 2) Energy Restaurant ";
	public static String info3=" Fly the man using AWSD keys"+" A-Left key D-Right key"+" W-Up key S-Down key "+
			"Enter space bar to get info about the places";

// End Static fields...
	
	public static void main(String[] args) {
		Control ctrl = new Control();				// Do NOT remove!
		ctrl.gameLoop();							// Do NOT remove!
	}
	
	/* This is your access to things BEFORE the game loop starts */
	public static void start() {
		// TODO: Code your starting conditions here...NOT DRAW CALLS HERE! (no addSprite or drawString)

		//sprites.add(new spriteInfo(new Vector2D(0, 0),"wall"));
		wallList.clear();

	}




	/* This is your access to the "game loop" (It is a "callback" method from the Control class (do NOT modify that class!))*/
	public static void update(Control ctrl) {
		// TODO: This is where you can code! (Starting code below is just to show you how it works)

							 				// Add a tester sprite to render list by tag (Remove later! Test only!)

		ctrl.drawString(0, 30, info1, c);
		ctrl.drawString(0, 60, info2, c);
		ctrl.drawString(0, 90, info3, c);


		ctrl.drawString(900, 130, trigger, c1);



		//ctrl.addSpriteToFrontBuffer(currentVec.getX(), currentVec.getY(), "man");
		ctrl.addSpriteToFrontBuffer(0, 0, "wall");
		ctrl.addSpriteToFrontBuffer(currentVec.getX(), currentVec.getY(), "man");

		Wall wall1 = new Wall(0,0,30,50);
//
		// Test drawing text on screen where you want (Remove later! Test only!)



	}
	
	// Additional Static methods below...(if needed)
	public static Queue<Vector2D> vecs1 = new LinkedList<>();
	public static Queue<Vector2D> vecs2 = new LinkedList<>();
	public static Vector2D currentVec = new Vector2D(750, 450);
	public static spriteInfo s1 = new spriteInfo (new Vector2D(100, 50), "star");
	public static ArrayList<spriteInfo> sprites = new ArrayList<>();

	public static int currentSpriteIndex = 0;
	public static HashMap<String, String> map = new HashMap<>();
	public static ArrayList<Wall>  wallList =  new ArrayList<>();



}
