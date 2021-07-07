package morseCodeExercise;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
	
	public String translate(String morse) {
		
		final Map<String, String> MORSEKEY = new HashMap<>();
		
		MORSEKEY.put(".-","a");
		MORSEKEY.put("-...","b");
		MORSEKEY.put("-.-.","c");
		MORSEKEY.put("-..","d");
		MORSEKEY.put(".","e");
		MORSEKEY.put("..-.","f");
		MORSEKEY.put("--.","g");
		MORSEKEY.put("....","h");
		MORSEKEY.put("..","i");
		MORSEKEY.put(".---","j");
		MORSEKEY.put("-.-","k");
		MORSEKEY.put(".-..","l");
		MORSEKEY.put("--","m");
		MORSEKEY.put("-.","n");
		MORSEKEY.put("---","o");
		MORSEKEY.put(".--.","p");
		MORSEKEY.put("--.-","q");
		MORSEKEY.put(".-.","r");
		MORSEKEY.put("...","s");
		MORSEKEY.put("-","t");
		MORSEKEY.put("..-","u");
		MORSEKEY.put("...-","v");
		MORSEKEY.put(".--","w");
		MORSEKEY.put("-..-","x");
		MORSEKEY.put("-.--","y");
		MORSEKEY.put("--..","z");
		MORSEKEY.put("/", " ");
		
		
		String output = "";
		
		for (String letter : morse.split(" ")) {
			output += MORSEKEY.get(letter);
		}
		
		return output;
	}
	

}
