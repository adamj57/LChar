package tk.adamj57.LChar;
import java.awt.Point;

import processing.core.PApplet;

import com.rngtng.launchpad.LColor;
import com.rngtng.launchpad.Launchpad;


public class Testing {

	
	
	public static void main(String[] args){
		
		LDisplay lp = new LDisplay(new Launchpad(new PApplet(), "Launchpad Mini", "Launchpad Mini"));
		
		
		Point[] allEmpty = new Point[64];
		
		for(int i = 0; i < 64; i++){
			
			allEmpty[i] = new Point(0, 0);
		}
		
		//TODO program daj�cy mo�liwo�� narysowania litery na lp i przekonwertowaniu jej do postaci polece�
		
		lp.getLp().dispose();
		
	}
}