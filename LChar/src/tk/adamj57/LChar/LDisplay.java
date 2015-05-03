package tk.adamj57.LChar;

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
	
	public void display(LChar character, int color){
		
		//TODO wyœwietlanie
	}
	
}
