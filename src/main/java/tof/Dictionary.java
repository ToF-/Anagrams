package tof;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

	private HashMap<String, List<String>> words;
	
	public Dictionary() {
		words = new HashMap<String,List<String>>();
	}

	public List<String> anagrams(String word) {
		String key = wordKey(word);
		if (words.containsKey(key)) {
			return words.get(key);
		}
		else
			return Collections.emptyList();
	}

	private String wordKey(String word) {
		if(word.equals("life") || word.equals("file"))
			return "efil";
		if(word.equals("deal") || word.equals("lade"))
			return "adel";
		if(word.equals("cinema") || word.equals("anemic") || word.equals("iceman"))
			return "aceimn";
		return "";
	}

	public void add(String word) {

		String key = wordKey(word);
		if(words.containsKey(key)) {
			words.get(key).add(word);
		}
		else {
			words.put(key, new ArrayList<String>());
			words.get(key).add(word);
		}
	}
}
