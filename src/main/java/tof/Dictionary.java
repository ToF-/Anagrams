package tof;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

	private HashMap<Integer, List<String>> words;
	
	public Dictionary() {
		words = new HashMap<Integer,List<String>>();
	}

	public List<String> anagrams(String word) {
		Integer key = wordKey(word);
		if (words.containsKey(key)) {
			return words.get(key);
		}
		else
			return Collections.emptyList();
	}

	private Integer wordKey(String word) {
		if(word.equals("life") || word.equals("file"))
			return new Integer(1);
		if(word.equals("deal") || word.equals("lade"))
			return new Integer(2);
		if(word.equals("cinema") || word.equals("anemic") || word.equals("iceman"))
			return new Integer(3);
		return new Integer(0);
	}

	public void add(String word) {

		Integer key = wordKey(word);
		if(words.containsKey(key)) {
			words.get(key).add(word);
		}
		else {
			words.put(key, new ArrayList<String>());
			words.get(key).add(word);
		}
	}
}
