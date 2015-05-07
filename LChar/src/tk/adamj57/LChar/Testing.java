package tk.adamj57.LChar;
import processing.core.PApplet;

import com.rngtng.launchpad.Launchpad;


public class Testing {

	
	
	public static void main(String[] args){
		
		LDisplay lp = new LDisplay(new Launchpad(new PApplet(), "Launchpad Mini", "Launchpad Mini"));
		
		/*
		Point[] allEmpty = new Point[64];
		
		for(int i = 0; i < 64; i++){
			
			allEmpty[i] = new Point(0, 0);
		}
		*/
		//TODO program daj¹cy mo¿liwoœæ narysowania litery na lp i przekonwertowaniu jej do postaci poleceñ
		
		lp.display(LChar.one);
		
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lp.getLp().dispose();
		
	}
}
