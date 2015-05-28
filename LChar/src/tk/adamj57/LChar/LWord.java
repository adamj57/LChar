package tk.adamj57.LChar;

import java.util.ArrayList;

public class LWord {

	private ArrayList<LChar> LWord;
	
	public LWord(String word) throws UndefinedCharException{
		
		int wordLength = word.length();
		
		for(int i = 0; i < wordLength; i++){
			
			LWord.add(LChar.toLChar(
					word.charAt(i)));
			
		}
		
	}
	
	public LChar[] toArray(){
		
		return (LChar[]) LWord.toArray();
	}
}
