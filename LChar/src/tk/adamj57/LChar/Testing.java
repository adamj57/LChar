package tk.adamj57.LChar;
import java.awt.Point;
import java.util.Scanner;

import processing.core.PApplet;

import com.rngtng.launchpad.LColor;
import com.rngtng.launchpad.Launchpad;


public class Testing {

	
	
	public static void main(String[] args){
		
		LDisplay lp = new LDisplay(new Launchpad(new PApplet(), "Launchpad Mini", "Launchpad Mini"));
		
		
		Point[] allEmpty = new Point[64];
		
		int i = 0;
			
			for (int j = 0; j<8; j++){
				
				for (int k = 0; k<8; k++){
					
					allEmpty[i] = new Point(k, j);
					i++;
				}
			}
			
		
		
		//TODO program daj¹cy mo¿liwoœæ narysowania litery na lp i przekonwertowaniu jej do postaci poleceñ
		
		LChar[] name = new LChar[]{
				LChar.A, LChar.n, LChar.t, LChar.e, LChar.k
				
		};
		
		
		
		for(LChar letter : name){
			
			lp.display(letter);
			
			String quit = new Scanner(System.in).nextLine();
			/*
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			lp.display(allEmpty, LColor.GREEN_OFF);
		}
	
		
		lp.getLp().dispose();
		
	}
}
