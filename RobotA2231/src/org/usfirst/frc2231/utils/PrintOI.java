package org.usfirst.frc2231.utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import javax.imageio.ImageIO;

public class PrintOI {
	static BufferedImage image;
	static StringBuilder sb;
	static BufferedReader br;
	static String OI;
	static int codeIndex;
	static int nameIndex;//the one with =
	static int buttonIndex;
	static String button = "new JoystickButton";
	static String joystick = "new Joystick(";
	static int joystickCount = 0;
	public static void main(String[] args) throws Exception{
		//TODO: serious cleanup
		Graphics g;
		Graphics g2;
		image = ImageIO.read(new File("controls\\test1.png")/*new URL(
		"http://cfile223.uf.daum.net/image/24774B4A55A47245295812")*/);
		sb = new StringBuilder();
		br = new BufferedReader(new FileReader("controls\\OI.txt"));
		OI = br.readLine();
		g = image.getGraphics();
		g.setFont(g.getFont().deriveFont(20f));
		g.setColor(Color.black);
		drawJoystick(g);
		drawJoystick(g);
		image = ImageIO.read(new File("controls\\test1.png"));
		g2 = image.getGraphics();
		g2.setFont(g2.getFont().deriveFont(20f));
		g2.setColor(Color.black);		
		drawJoystick(g2);
		joystickCount++;
		ImageIO.write(image, "png", new File("controls\\joystick" + (joystickCount - 1) + ".png"));
		g.dispose();
		br.close();
		System.out.println("finished");
	}
	
	public static void drawJoystick(Graphics g) throws Exception{
		String button = "new JoystickButton";
		String joystick = "new Joystick(";
		try{
			while(OI != null){
				System.out.println(OI);
				codeIndex = OI.indexOf(')');
				nameIndex = OI.indexOf('=') - 1;
				buttonIndex = OI.indexOf("Button");
				if(OI.indexOf(button) != -1 && OI.indexOf("//") == -1)
				{
					String buttonName = OI.substring(0, buttonIndex == -1 || buttonIndex > nameIndex ? nameIndex : buttonIndex);
					String buttonCode = OI.substring(codeIndex - 1, codeIndex);
					Point buttonLocation = ButtonCodesLocations.getLocation(buttonCode);
					g.drawString(buttonName, (int)buttonLocation.getX(), (int)buttonLocation.getY());
					System.out.println(buttonName + (int)buttonLocation.getX() + " " + (int)buttonLocation.getY());
				}
				if(OI.indexOf(joystick) != -1 &&  OI.indexOf("//") == -1)
				{
					joystickCount++;
					sb.append(OI);
					sb.append(System.lineSeparator());
					OI = br.readLine();
					if(joystickCount >= 0){
						ImageIO.write(image, "png", new File("controls\\joystick" + (joystickCount - 1) + ".png"));
						return;
					}
				}
				sb.append(OI);
				sb.append(System.lineSeparator());
				OI = br.readLine();
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
