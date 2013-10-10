package tof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

	private HashMap<String, List<String>> words;
	
	public Dictionary() {
		words = new HashMap<String,List<String>>();
	}

	public List<String> anagrams(String word) {
		String key = key(word);
		if (words.containsKey(key)) {
			return words.get(key);
		}
		else
			return Collections.emptyList();
	}

	private String key(String word) {
		char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
	}

	public void add(String word) {

		String key = key(word);
		if(words.containsKey(key)) {
			words.get(key).add(word);
		}
		else {
			words.put(key, new ArrayList<String>());
			words.get(key).add(word);
		}
	}
}
