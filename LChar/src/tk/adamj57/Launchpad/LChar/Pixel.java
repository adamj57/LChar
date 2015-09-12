package tk.adamj57.Launchpad.LChar;

import java.awt.Point;

import com.rngtng.launchpad.LColor;

public class Pixel extends Point {

	private static final long serialVersionUID = -131403115409166489L;

	public int color;
	
	public Pixel() {
		super();
		color = 3;
	}
	
	public Pixel(int color){
		super(0, 0);
		this.color = color;
	}

	public Pixel(Point p) {
		super(p);
		color = 3;
	}
	
	public Pixel(Point p, int color) {
		super(p);
		this.color = color;
	}

	public Pixel(int x, int y) {
		super(x, y);
		color = 3;
	}
	
	public Pixel(int x, int y, int color) {
		super(x, y);
		this.color = color;
	}

	public int getColor(){
		return color;
	}
	
	public void setColor(int color){
		this.color = color;
	}
	
	public static Pixel[] changeColor(Pixel[] toChange, int color){
		
		Pixel[] toChangeClone = toChange.clone();
		
		for (int i = 0; i < toChangeClone.length; i ++){
			
			Pixel changed = (Pixel) toChangeClone[i].clone();
			changed.color = color;
			
			toChangeClone[i] = changed;
			
		}
		
		return toChangeClone;
	}
	public static Pixel[][] blankGrid(){
		
		Pixel[][] grid = new Pixel[8][8];
		
		for (int i = 0; i < 8; i++) {
			
			for (int j = 0; j < 8; j++) {
				grid[i][j] = new Pixel(i, j, LColor.OFF);
				
			}
			
			
		}
		return grid;
	}
}
