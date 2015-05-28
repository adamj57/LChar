package tk.adamj57.LChar;
import java.awt.Point;
import java.util.Scanner;

import processing.core.PApplet;

import com.rngtng.launchpad.LColor;
import com.rngtng.launchpad.Launchpad;


public class Testing {

	
	
	public static void main(String[] args) throws UndefinedCharException{
		
		LDisplay lp = new LDisplay(new Launchpad(new PApplet(), "Launchpad Mini", "Launchpad Mini"));
		
		
		Point[] allEmpty = new Point[64];
		
		int i = 0;
			
			for (int j = 0; j<8; j++){
				
				for (int k = 0; k<8; k++){
					
					allEmpty[i] = new Point(k, j);
					i++;
				}
			}
			

		
		
			lp.getLp().dispose();
		
	
	
		
		
		
	}
}
