package tof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

	private HashMap<Integer, List<String>> words;
	
	public Dictionary() {
		words = new HashMap<Integer,List<String>>();
	}

	public List<String> anagrams(String word) {
		Integer key = new Integer(word.length());
		if (words.containsKey(key)) {
			return words.get(key);
		}
		return Collections.emptyList();
	}

	public void add(String word) {

		Integer key = new Integer(word.length());
		if(words.containsKey(key)) {
			words.get(key).add(word);
		}
		else {
			words.put(key, new ArrayList<String>());
			words.get(key).add(word);
		}
	}
}
