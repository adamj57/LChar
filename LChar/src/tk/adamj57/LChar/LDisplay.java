package tk.adamj57.LChar;

import java.awt.Point;
import java.util.ArrayList;

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
		
		ArrayList<Point> panoramaToDisplay = toPanorama(word);
		
		scroll(panoramaToDisplay);
		
		
	}
	
	private void scroll(ArrayList<Point> panoramaToDisplay){
		
		boolean hasPointsToDisplay = true;
		ArrayList<Point> pointsToDisplay = new ArrayList<Point>();
		
		while(hasPointsToDisplay){
			
			for(Point point : panoramaToDisplay){
				
				if(point.getX() <= 7  && point.getX() >=0){
					
					pointsToDisplay.add(point);
					
				}
			}
			
			
			
			display((Point[]) pointsToDisplay.toArray());
			
			pointsToDisplay.clear();
			
			for(int i = 0; i < panoramaToDisplay.size(); i++){
				
				panoramaToDisplay.get(i).setLocation(panoramaToDisplay.get(i).getX() - 1, panoramaToDisplay.get(i).getY());
				
			}
			hasPointsToDisplay = false;
			for(int i = 0; i < panoramaToDisplay.size(); i++){
				
				if(panoramaToDisplay.get(i).getX() > -1){
					
					hasPointsToDisplay = true;
				}
				
			}
			
			
			
		}
		
		
		
		
	}

	private ArrayList<Point> toPanorama(LChar[] word) {
		
		ArrayList<Point> pointWord = new ArrayList<Point>();
		
		//ustalanie koordynat mozajki
		for (int i = 0; i < word.length; i++){
			
			//je¿eli spacja, pomijamy i dodajemy przerwê 8 pikseli
			if (word[i] == LChar.space){
				
				continue;
				
			}
			//zbiór pixeli jednej litery
			Point[] pixelList = word[i].getPixelList();
			
			//ustawiamy koordynaty do mozajki
			for(int j = 0; j < pixelList.length; j++){
				
				pixelList[j].setLocation(pixelList[j].getX() + (8 * (i + 1)), pixelList[j].getY());
				
			}
			
			//dodajemy gotowy znak w postaci punktów do pointWord
			for(Point pixel : pixelList){
				
				pointWord.add(pixel);
				
			}
			
			
		}
		return pointWord;
	}
	
	
	public void wordDisplay(LWord word){
		
		LChar[] LCharWord = word.toArray();
		
		wordDisplay(LCharWord);
		
	}
	
}
