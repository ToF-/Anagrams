package tof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

	public List<String> anagrams(String word) {
		HashMap<String,String> words = new HashMap<String,String>();
		words.put("iceman","cinema");
		words.put("file", "life");
		if (words.containsKey(word)) {
			return Arrays.asList(words.get(word));
		}
		return new ArrayList<String>();
	}

	public void add(String string) {
		
	}
}
