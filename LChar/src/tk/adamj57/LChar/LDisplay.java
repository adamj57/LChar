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
	
	public void display(LChar[] arrayToDisplay, long millis, int color){
		
		Point[][] arrayToDisplayConverted = new Point[arrayToDisplay.length][];
		
		int i = 0;
		for(LChar lchar : arrayToDisplay){
			
			arrayToDisplayConverted[i] = lchar.getPixelList();
			
			i++;
		}
		
		display(arrayToDisplayConverted, millis, color);
		
	}
	
	public void display(LChar[] arrayToDisplay, long millis){
		
		display(arrayToDisplay, millis, LColor.HIGH);
		
	}
	
	public void display(LChar[] arrayToDisplay, int color){
		
		display(arrayToDisplay, 100, color);
		
	}
	
	public void display(LChar[] arrayToDisplay){
		
		display(arrayToDisplay, 100, LColor.HIGH);
		
	}
	
	///
	///		POINT[][] METHODS
	///
	
	public void display(Point[][] arrayToDisplay, long millis, int color){
		
		Point[] displayableArray = convertToDisplayableArray(arrayToDisplay);
		
		
		scroll(displayableArray, millis, color);
	}

	
	

	public void display(Point[][] arrayToDisplay, long millis){
		
		display(arrayToDisplay, millis, LColor.HIGH);
		
	}
	
	public void display(Point[][] arrayToDisplay, int color){
		
		display(arrayToDisplay, 100, color);
		
	}
	
	public void display(Point[][] arrayToDisplay){
		
		display(arrayToDisplay, 100, LColor.HIGH);
		
	}
	
	public void displayRawAnimation(Point[][] arrayOfFrames){
		
		displayRawAnimation(arrayOfFrames, 100, LColor.HIGH);
	}
	
	public void displayRawAnimation(Point[][] arrayOfFrames, int color){
		
		displayRawAnimation(arrayOfFrames, 100, color);
	}
	
	public void displayRawAnimation(Point[][] arrayOfFrames, long millis){
		
		displayRawAnimation(arrayOfFrames, millis, LColor.HIGH);
	}
	
	public void displayRawAnimation(Point[][] arrayOfFrames, long millis, int color){
		
		for(Point[] frame : arrayOfFrames){
			
			display(frame, color);
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void clear(){
		
		Point[] allEmpty = new Point[64];
		
		int i = 0;
		
		for (int j = 0; j<8; j++){
			
			for (int k = 0; k<8; k++){
				
				allEmpty[i] = new Point(k, j);
				i++;
			}
		}
		
		display(allEmpty, LColor.GREEN_OFF);
	}
	
	
	///
	///		HELPING METHODS
	///
	
	private Point[] convertToDisplayableArray(Point[][] arrayToConvert){
		
		ArrayList<Point> convertedArray = new ArrayList<Point>();
		
		Point[][] copyOfArrayToConvert = arrayToConvert.clone();
		
		int i = 1;
		for(Point[] character : copyOfArrayToConvert){
			
			Point [] copyOfCharacter = character.clone();
			
			if(copyOfCharacter == LChar.space.getPixelList()){
				
				System.out.println("Wykryto spacje!"); //debug
				
			}else{
				
				for(Point point : copyOfCharacter){
					
					Point copyOfPoint = (Point) point.clone();
					
					copyOfPoint.setLocation(copyOfPoint.getX() + (i*8), copyOfPoint.getY());
					
					convertedArray.add(copyOfPoint);
				}
				
			}
			
			i++;
			
		}
		
		
		return convertedArray.toArray(new Point[]{});
	}
	
	
	private void scroll(Point[] arrayToScroll,  long millis, int color){
		
		
		ArrayList<Point> frameToDisplay = new ArrayList<Point>();
		
		
		
		
		boolean hasPixelsToDisplay = true;
		
		while(hasPixelsToDisplay){	
		
			for(Point pixel : arrayToScroll){
			
				if(pixel.getX() >= 0 && pixel.getX() <= 7){
				
					frameToDisplay.add(pixel);
				}
			}
			
			
			clear();
			
			if(!frameToDisplay.isEmpty()){
				
				display(frameToDisplay.toArray(new Point[0]), color);
				
			}
			
		
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
			frameToDisplay.clear();
			
			
			
			for(int j = 0; j < arrayToScroll.length; j++){
			
				Point changed = arrayToScroll[j];
			
				changed.setLocation(changed.getX() - 1, changed.getY());
			
				arrayToScroll[j] = changed;
			}
			
			hasPixelsToDisplay = false;
		
			for(int j = 0; j < arrayToScroll.length; j++){
			
				if(arrayToScroll[j].getX() > -1){
				
					hasPixelsToDisplay = true;
					
				}
			}
			
		}
	
	}
}
	

