package tk.adamj57.LChar;

import java.awt.Point;

public enum LChar {

	a(new Point[]{
			createPoint(1, 4), 
			createPoint(2, 1), createPoint(2, 3), createPoint(2, 5), 
			createPoint(3, 1), createPoint(3, 3), createPoint(3, 5), 
			createPoint(4, 1), createPoint(4, 3), createPoint(4, 5), 
			createPoint(5, 1), createPoint(5, 3), createPoint(5, 4), 
			createPoint(6, 2), createPoint(6, 3), createPoint(6, 4), createPoint(6, 5)}, 
			'a'),
	b(new Point[]{
			createPoint(1, 0), createPoint(1, 1), createPoint(1, 2), createPoint(1, 3), createPoint(1, 4), createPoint(1, 5), 
			createPoint(2, 2), createPoint(2, 4), 
			createPoint(3, 2), createPoint(3, 5), 
			createPoint(4, 2), createPoint(4, 5), 
			createPoint(5, 2), createPoint(5, 5), 
			createPoint(6, 3), createPoint(6, 4)},
			'b'),
	c(new Point[]{
			createPoint(2, 3), createPoint(2, 4), 
			createPoint(3, 2), createPoint(3, 5),
			createPoint(4, 2), createPoint(4, 5), 
			createPoint(5, 2), createPoint(5, 5)}, 
			'c'), 
	d(new Point[]{
			createPoint(1, 3), createPoint(1, 4), 
			createPoint(2, 2), createPoint(2, 5), 
			createPoint(3, 2), createPoint(3, 5), 
			createPoint(4, 2), createPoint(4, 5), 
			createPoint(5, 2), createPoint(5, 4), 
			createPoint(6, 0), createPoint(6, 1), createPoint(6, 2), createPoint(6, 3), createPoint(6, 4), createPoint(6, 5)}, 
			'd'), 
	e(new Point[]{
			createPoint(1, 2), createPoint(1, 3), createPoint(1, 4), 
			createPoint(2, 1), createPoint(2, 3), createPoint(2, 5), 
			createPoint(3, 1), createPoint(3, 3), createPoint(3, 5), 
			createPoint(4, 1), createPoint(4, 3), createPoint(4, 5), 
			createPoint(5, 1), createPoint(5, 3), createPoint(5, 5), 
			createPoint(6, 2), createPoint(6, 3)}, 
			'e'),
	f(new Point[]{
			createPoint(2, 3), 
			createPoint(3, 1), createPoint(3, 2), createPoint(3, 3), createPoint(3, 4), createPoint(3, 5), 
			createPoint(4, 1), createPoint(4, 3)}, 
			'f'), 
	g(new Point[]{
			createPoint(1, 3), createPoint(1, 4), 
			createPoint(2, 2), createPoint(2, 5), createPoint(2, 7), 
			createPoint(3, 2), createPoint(3, 5), createPoint(3, 7), 
			createPoint(4, 3), createPoint(4, 7), 
			createPoint(5, 2), createPoint(5, 3), createPoint(5, 4), createPoint(5, 5), createPoint(5, 6)}, 
			'g'), 
	h(new Point[]{
			createPoint(2, 0), createPoint(2, 1), createPoint(2, 2), createPoint(2, 3), createPoint(2, 4), createPoint(2, 5), 
			createPoint(3, 2), 
			createPoint(4, 2), 
			createPoint(5, 3), createPoint(5, 4), createPoint(5, 5)}, 
			'h'), 
	i(new Point[]{
			createPoint(4, 0), createPoint(4, 2), createPoint(4, 3), createPoint(4, 4), createPoint(4, 5)}, 
			'i'),
	j(new Point[]{
			createPoint(1, 7), 
			createPoint(2, 7), 
			createPoint(3, 2), createPoint(3, 7), 
			createPoint(4, 0), createPoint(4, 2), createPoint(4, 3), createPoint(4, 4), createPoint(4, 5), createPoint(4, 6)}, 
			'j'), 
	k(new Point[]{
			createPoint(2, 1), createPoint(2, 2), createPoint(2, 3), createPoint(2, 4), createPoint(2, 5), 
			createPoint(3, 4), createPoint(4, 3), createPoint(4, 5), 
			createPoint(5, 2), createPoint(5, 5)}, 
			'k'), 
	l(new Point[]{createPoint(3, 0), createPoint(3, 1), createPoint(3, 2), createPoint(3, 3), createPoint(3, 4), createPoint(3, 5), 
			createPoint(4, 5)}, 
			'l'), 
	m(new Point[]{
			createPoint(1, 2), createPoint(1, 3), createPoint(1, 4), createPoint(1, 5), 
			createPoint(2, 2), 
			createPoint(3, 3), 
			createPoint(4, 3), 
			createPoint(5, 2), 
			createPoint(6, 2), createPoint(6, 3), createPoint(6, 4), createPoint(6, 5)}, 
			'm'), 
	n(new Point[]{
			createPoint(2, 2), createPoint(2, 3), createPoint(2, 4), createPoint(2, 5), 
			createPoint(3, 3), 
			createPoint(4, 2), 
			createPoint(5, 2), 
			createPoint(6, 2), createPoint(6, 3), createPoint(6, 4), createPoint(6, 5)}, 
			'n'), 
	o(new Point[]{
			createPoint(1, 3), createPoint(1, 4), 
			createPoint(2, 2), createPoint(2, 5), 
			createPoint(3, 2), createPoint(3, 5), 
			createPoint(4, 2), createPoint(4, 5), 
			createPoint(5, 2), createPoint(5, 5), 
			createPoint(6, 3), createPoint(6, 4)}, 
			'o'),
	p(new Point[]{
			createPoint(1, 2), createPoint(1, 3), createPoint(1, 4), createPoint(1, 5), createPoint(1, 6), createPoint(1, 7), 
			createPoint(2, 3), createPoint(2, 5), 
			createPoint(3, 2), createPoint(3, 5), 
			createPoint(4, 2), createPoint(4, 5), 
			createPoint(5, 2), createPoint(5, 5), 
			createPoint(6, 3), createPoint(6, 4)}, 
			'p'), 
	q(new Point[]{
			createPoint(1, 3), createPoint(1, 4), 
			createPoint(2, 2), createPoint(2, 5), 
			createPoint(3, 2), createPoint(3, 5), 
			createPoint(4, 2), createPoint(4, 5), 
			createPoint(5, 3), createPoint(5, 5), 
			createPoint(6, 2), createPoint(6, 3), createPoint(6, 4), createPoint(6, 5), createPoint(6, 6), createPoint(6, 7)}, 
			'q'), 
	
	r(new Point[]{
			createPoint(2, 2), createPoint(2, 3), createPoint(2, 4), createPoint(2, 5), 
			createPoint(3, 3), 
			createPoint(4, 2), 
			createPoint(5, 2), 
			createPoint(6, 3)}, 
			'r'), 
	s(new Point[]{
			createPoint(2, 3), createPoint(2, 6), 
			createPoint(3, 2), createPoint(3, 4), createPoint(3, 6), 
			createPoint(4, 2), createPoint(4, 4), createPoint(4, 6), 
			createPoint(5, 2), createPoint(5, 5)}, 
			's');
	
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
		
		LChar[] allValuesOfLChar = LChar.values();
		
		for(LChar lChar : allValuesOfLChar){
			
			if(character == LChar.toChar(lChar)){
				
				return lChar;
			}
			
		}
		
		throw new UndefinedCharException();
	}
	
	private static Point createPoint(int x, int y){
		
		return new Point(x, y);
	}
}
