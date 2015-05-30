package tk.adamj57.LChar;

import java.awt.Point;
import java.util.ArrayList;
import com.rngtng.launchpad.LColor;
import com.rngtng.launchpad.Launchpad;

public class LDisplay {

	private Launchpad lp;
	
	///
	///		LAUNCHPAD MODIFICATION
	///
	
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
	
	///
	///		DISPLAY ONE CHAR
	///
	
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
			
			lp.changeGrid(((int) pixel.getX()), ((int) pixel.getY()), color);
			
		}
	}
	
	///
	///		DISPLAY STRING WITH SCROLLING
	///
	
	///
	/// 	LCHAR[] METHODS
	///
	
	public void display(LChar[] stringToDisplay, long millis, int color){
		
		Point[][] stringToDisplayConverted = new Point[stringToDisplay.length][];
		
		int i = 0;
		for(LChar lchar : stringToDisplay){
			
			stringToDisplayConverted[i] = lchar.getPixelList();
			
			i++;
		}
		
		display(stringToDisplayConverted, millis, color);
		
	}
	
	public void display(LChar[] stringToDisplay, long millis){
		
		display(stringToDisplay, millis, LColor.HIGH);
		
	}
	
	public void display(LChar[] stringToDisplay, int color){
		
		display(stringToDisplay, 100, color);
		
	}
	
	public void display(LChar[] stringToDisplay){
		
		display(stringToDisplay, 100, LColor.HIGH);
		
	}
	
	///
	///		POINT[][] METHODS
	///
	
	public void display(Point[][] stringToDisplay, long millis, int color){
		
		Point[] displayableString = convertToDisplayablePoint(stringToDisplay);
		
		//TODO display method
	}
	
	private Point[] convertToDisplayablePoint(Point[][] stringToConvert){
		
		ArrayList<Point> convertedString = new ArrayList<Point>();
		
		int i = 1;
		for(Point[] character : stringToConvert){
			
			if(character == new Point[]{}){
				
				i++;
				continue;
				
			}
			for(Point point : character){
				
				point.setLocation(point.getX() + (i*8), point.getY());
				
				convertedString.add(point);
			}
			
			i++;
			
		}
		
		
		return convertedString.toArray(new Point[]{});
	}
	
	public void display(Point[][] stringToDisplay, long millis){
		
		display(stringToDisplay, millis, LColor.HIGH);
		
	}
	
	public void display(Point[][] stringToDisplay, int color){
		
		display(stringToDisplay, 100, color);
		
	}
	
	public void display(Point[][] stringToDisplay){
		
		display(stringToDisplay, 100, LColor.HIGH);
		
	}
	
	
	
}
