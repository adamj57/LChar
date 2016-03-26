package tk.adamj57.Launchpad.LChar;

import com.rngtng.launchpad.LColor;
import com.rngtng.launchpad.Launchpad;

import java.awt.*;
import java.util.ArrayList;

public class LDisplay {

	private Launchpad lp;
	///
	///		LAUNCHPAD MODIFICATION
	///
	
	public LDisplay(Launchpad lp)
	{
		this.setLp(lp);
	}

    public void setFlashing(boolean flashing) {
        if(flashing){
            lp.flashingOn();
        }else{
            lp.flashingOff();
        }

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
            int x = (int) pixel.getX();
            int y = (int) pixel.getY();
            lp.changeGrid(x, y, color);
        }
	}

    public void display(Pixel[] character){
        for (Pixel pixel : character){
            if (pixel.isGridPixel){
                lp.changeGrid(pixel.x, pixel.y, pixel.color);
            }else{
                lp.changeButton(pixel.button, pixel.color);
            }
        }
    }

	///
	///		DISPLAY STRING WITH SCROLLING
	///
	
	///
	/// 	LCHAR[] METHODS
	///
	
	public void display(LChar[] arrayToDisplay, long millis, int color) throws InterruptedException{
		
		Point[][] arrayToDisplayConverted = new Point[arrayToDisplay.length][];
		
		int i = 0;
		for(LChar lchar : arrayToDisplay){
			
			arrayToDisplayConverted[i] = lchar.getPixelList();
			
			i++;
		}
		
		display(arrayToDisplayConverted, millis, color);
		
	}
	
	public void display(LChar[] arrayToDisplay, long millis) throws InterruptedException{
		
		display(arrayToDisplay, millis, LColor.HIGH);
		
	}
	
	public void display(LChar[] arrayToDisplay, int color) throws InterruptedException{
		
		display(arrayToDisplay, 100, color);
		
	}
	
	public void display(LChar[] arrayToDisplay) throws InterruptedException{
		
		display(arrayToDisplay, 100, LColor.HIGH);
		
	}
	
	///
	///		POINT[][] METHODS
	///
	
	public void display(Point[][] arrayToDisplay, long millis, int color) throws InterruptedException{
		
		Point[] displayableArray = convertToDisplayableArray(arrayToDisplay);
		
		
		displayRawAnimation(convertToFrames(displayableArray), millis, color);
	}

	
	

	public void display(Point[][] arrayToDisplay, long millis) throws InterruptedException{
		
		display(arrayToDisplay, millis, LColor.HIGH);
		
	}
	
	public void display(Point[][] arrayToDisplay, int color) throws InterruptedException{
		
		display(arrayToDisplay, 100, color);
		
	}
	
	public void display(Point[][] arrayToDisplay) throws InterruptedException{
		
		display(arrayToDisplay, 100, LColor.HIGH);
		
	}
	
	public void displayRawAnimation(Point[][] arrayOfFrames) throws InterruptedException{
		
		displayRawAnimation(arrayOfFrames, 100, LColor.HIGH);
	}
	
	public void displayRawAnimation(Point[][] arrayOfFrames, int color) throws InterruptedException{
		
		displayRawAnimation(arrayOfFrames, 100, color);
	}
	
	public void displayRawAnimation(Point[][] arrayOfFrames, long millis) throws InterruptedException{
		
		displayRawAnimation(arrayOfFrames, millis, LColor.HIGH);
	}
	
	public void displayRawAnimation(Point[][] arrayOfFrames, long millis, int color) throws InterruptedException{
		
		clear();
		for(Point[] frame : arrayOfFrames){
			
			
			display(frame, color);
			Thread.sleep(millis);
			clear();
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
	
	private Point[] convertToDisplayableArray(Point[][] arrayToConvert){ //to ma da� poszczeg�lne klatki do wy�wietlenia, ma zwraca� Point[][], �eby m�g� by� dawany do displayRawAnimation
		
		ArrayList<Point> convertedArray = new ArrayList<Point>();
		
		Point[][] copyOfArrayToConvert = arrayToConvert.clone();
		
		int i = 1;
		for(Point[] character : copyOfArrayToConvert){
			
			Point [] copyOfCharacter = character.clone();
			
			if(copyOfCharacter != LChar.space.getPixelList()){

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
	
	
	private Point[][] convertToFrames(Point[] arrayPassed) { //to ma PRZESTA� ISTNIE�, ma by� rozdzielone do convertToDisplayableArray i displayRawAnimation
		
		ArrayList<Point[]> frames = new ArrayList<Point[]>();
		ArrayList<Point> frameToCreate = new ArrayList<Point>();
		Point[] array = arrayPassed.clone();
		boolean hasPixelsToAdd = true;
		while(hasPixelsToAdd){	
		
			for(Point pixel : array){ //creating
			
				if(pixel.getX() >= 0 && pixel.getX() <= 7){
				
					frameToCreate.add((Point)pixel.clone());
				}
			}
				
			frames.add((Point[]) frameToCreate.toArray(new Point[0]).clone());
				
			frameToCreate.clear(); //creating
			
			
			for(int j = 0; j < array.length; j++){ //creating
			
				Point changed = (Point) array[j].clone();
			
				changed.setLocation(changed.getX() - 1, changed.getY());
			
				array[j] = (Point) changed.clone();
			}
			
			hasPixelsToAdd = false;
			loop:for(int j = 0; j < array.length; j++){ //display & creating
			
				if(array[j].getX() > -1){
				
					hasPixelsToAdd = true;
					break loop;
					
				}
			}
		}
		return frames.toArray(new Point[0][0]);
	
	}
}
	

