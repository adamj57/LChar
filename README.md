# LChar

This Java library is addition to [rngtng\Launchpad processing library](https://github.com/rngtng/launchpad).
Requirements
--------------
- core.jar from processing core folder (But if you're programming in processing, obviously you don't need processing core, that's just for java programmers.),
- [rngtng\Launchpad processing library](https://github.com/rngtng/launchpad), 
- [TheMidiBus, other processing library](http://www.smallbutdigital.com/themidibus.php).

What it does?
--------------
Basicly, this lib provides character and string display methods.

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
		
		    lp.display(LChar.toLChar('a'), LColor.YELLOW_HIGH);
		
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
  

When you have to display a string (for example "Test"), do that:

	lp.display(LChar.toLChar("Test")); //This will display "Test" scrolled to left with red color and 1 frame per 100 millis

Or, when you need greater/smaller speed, do that:

	lp.display(LChar.toLChar("Test"), 25L); //This will display "Test" scrolled to left with red color and 1 frame per 25 millis
	
Or, when you need different color:

	lp.display(LChar.toLChar("Test"), LColor.GREEN_HIGH); //This will display "Test" scrolled to left with green color and 1 frame per 100 millis
	
Or, lastly, when you need both of color and different speed:

	lp.display(LChar.toLChar("Test"), 25L, LColor.GREEN_HIGH); //This will display "Test" scrolled to left with green color and 1 frame per 25 millis
	
Also, if you have to display char or picture that isn't in LChar, you have to make Point[][] array with Point[] arrays containing chars/images to display in order:

	Point[][] string = new Point[][]{
								smile, whateverYouWant};
	lp.display(string);
	
Or, with including some LChars:

	Point[][] string = new Point[][]{
								LChar.toLChar('a').getPixelList(), LChar.toLChar('b').getPixelList(), LChar.toLChar('c').getPixelList(), LChar.toLchar(' ').getPixelList(), smile};