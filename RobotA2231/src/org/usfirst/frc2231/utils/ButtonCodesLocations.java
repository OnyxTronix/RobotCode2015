package org.usfirst.frc2231.utils;

import java.awt.Point;

public class ButtonCodesLocations {
	static Point a = new Point(730, 360);
	static Point b = new Point(750, 290);
	static Point x = new Point(650, 290);
	static Point y = new Point(730, 220);
	static Point leftBumper = new Point(75, 85);
	static Point rightBumper = new Point(730, 85);
	static Point back = new Point(275, 275);
	static Point start = new Point(375, 225);
	
	public static Point getLocation(String buttonCode){
		switch(buttonCode){
			case "1": return a;
			case "2": return b;
			case "3": return x;
			case "4": return y;
			case "5": return leftBumper;
			case "6": return rightBumper;
			case "7": return back;
			case "8": return start;
			default: return start;
		}
	}
}
