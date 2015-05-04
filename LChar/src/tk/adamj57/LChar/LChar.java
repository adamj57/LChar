package tk.adamj57.LChar;

import java.awt.Point;

public enum LChar {

	a(new Point[]{}, 'a'),
	b(new Point[]{}, 'b');
	
	private Point[] pixelList;
	private char character;
	
	private LChar(Point[] pixelList, char character){
		
		this.pixelList = pixelList;
		this.character = character;
		
	}
	
	public Point[] getPixelList(){
		
		return pixelList;
	}
	
	public static char toChar(LChar lChar){
		
		return lChar.character;
	}
	
	public static LChar toLChar(char character) throws UndefinedCharException{
		
		LChar[] all = LChar.values();
		
		for(LChar lChar : all){
			
			if(character == LChar.toChar(lChar)){
				
				return lChar;
			}
			
		}
		
		throw new UndefinedCharException();
	}
	
	private Point createPoint(int x, int y){
		
		return new Point(x, y);
	}
}
