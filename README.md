# LChar

This Java library is addition to [rngtng\Launchpad processing library](https://github.com/rngtng/launchpad).
Requirements
--------------
- core.jar from processing core folder (But if you're programming in processing, obviously you don't need processing core, that's just for java programmers.),
- [rngtng\Launchpad processing library](https://github.com/rngtng/launchpad), 
- [TheMidiBus, other processing library](http://www.smallbutdigital.com/themidibus.php).

What it does?
--------------
Basicly, this lib provides character and (in future) word display methods. Words will be animated from right to left with changeable speed.

Usage
--------------
To display one letter ('a') on launchpad LEDs for 2 secs, simply do this:

    package com.test.testing;
    
    import processing.core.PApplet;
    
    import com.rngtng.launchpad.LColor;
    import com.rngtng.launchpad.Launchpad;
    
    import tk.adamj57.LChar;
    
    public class Testing {
    
    	public static void main(String[] args){
		
		    //create LDisplay instance, it requires Launchpad Object, which is referenced in rngtng\Launchpad
		    LDisplay lp = new LDisplay(new Launchpad(new PApplet(), "Launchpad Mini", "Launchpad Mini"));
		
		    lp.display(LChar.a, LColor.YELLOW_HIGH);
		
		    try {
		    	Thread.sleep(2000L);
		    } catch (InterruptedException e) {
		    	//"I don't care, I Love It!"
		    }
		
		    //When you've ended the use of Launchpad, use: (important!)
		    lp.getLp().dispose();
		  }
    }

If you have an char/image you want to display, use:

    lp.display(pixelList, LColor.YELLOW_HIGH);
where pixelList is Point array containing x's and y's to display. Sample array:

    Point[] smile = new Point[]{
    new Point(0, 0), new Point(0, 1), new Point(0, 2), new Point(0, 4), 
    new Point(1, 0), new Point(1, 2), new Point(1, 4), new Point(1, 5), 
    new Point(2, 0), new Point(2, 1), new Point(2, 2), new Point(2, 5), new Point(2, 6), 
    new Point(3, 6), new Point(3, 7), 
    new Point(4, 6), new Point(4, 7), 
    new Point(5, 0), new Point(5, 1), new Point(5, 2), new Point(5, 5), new Point(5, 6), 
    new Point(6, 0), new Point(6, 2), new Point(6, 4), new Point(6, 5), 
    new Point(7, 0), new Point(7, 1), new Point(7, 2), new Point(7, 4)};
  

There is also some conversion methods between char and LChar, but this is gonna be useful when i develop word display method.
