package tk.adamj57.LChar;

import java.awt.Point;

import com.rngtng.launchpad.LColor;
import com.rngtng.launchpad.Launchpad;

public class LDisplay {

	private Launchpad lp;
	
	public LDisplay(Launchpad lp)
	{
		this.setLp(lp);
	}

	public Launchpad getLp() {
		return lp;
	}

	public void setLp(Launchpad lp) {
		this.lp = lp;
	}
	
	public void display(LChar character){
		
		display(character, LColor.HIGH);
	}
	
	public void display(Point[] character){
		
		display(character, LColor.HIGH);
	}
	
	public void display(LChar character, int color){
		
		Point[] pixelList = character.getPixelList();
		display(pixelList, color);
	}
	
	public void display(Point[] character, int color){
		
		for(Point pixel : character){
			
			lp.changeGrid(((int)pixel.getX()), ((int)pixel.getY()), color);
			
		}
	}
	
	public void wordDisplay(LChar[] word){
		
	}
	
	public void wordDisplay(Point[][] word){
		
	}
	
	public void wordDisplay(LWord word){
		
		LChar[] LCharWord = word.toArray();
		
		wordDisplay(LCharWord);
		
	}
	
}
