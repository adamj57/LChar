package tk.adamj57.LChar;
import java.awt.Point;

import processing.core.PApplet;

import com.rngtng.launchpad.LColor;
import com.rngtng.launchpad.Launchpad;


public class Testing {

	
	
	public static void main(String[] args){
		
		LDisplay lp = new LDisplay(new Launchpad(new PApplet(), "Launchpad Mini", "Launchpad Mini"));
		
		lp.display(LChar.a);
		
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Point[] allEmpty = new Point[64];
		
		for(int i = 0; i < 64; i++){
			
			allEmpty[i] = new Point(0, 0);
		}
		
		lp.display(allEmpty);
		
		lp.display(LChar.a, LColor.YELLOW_HIGH);
		
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lp.display(allEmpty);
		
		lp.display(LChar.a.getPixelList(), LColor.YELLOW_HIGH);
		
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lp.getLp().dispose();
		
	}
}
