package tk.adamj57.Launchpad.LChar;

import java.awt.*;

public class Pixel implements Cloneable {

	private static final long serialVersionUID = -131403115409166489L;

	public int color;

	public int x;
    public int y;

    public boolean isGridPixel = true;

    public int button;

    public Pixel(int button, int color){
        this.button = button;
        this.color = color;
        isGridPixel = false;
    }
	
	public Pixel(Point p, int color) {
        x = p.x;
        y = p.y;
		this.color = color;
	}
	
	public Pixel(int x, int y, int color) {
        this.x = x;
        this.y = y;
		this.color = color;
	}

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getButton(){
        return button;
    }

    public void setButton(int button){
        this.button = button;
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

            Pixel changed = null;
            try {
                changed = (Pixel) toChangeClone[i].clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            changed.color = color;
			
			toChangeClone[i] = changed;
			
		}
		
		return toChangeClone;
	}
}
