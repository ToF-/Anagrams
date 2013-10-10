package tof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

	private HashMap<String, List<String>> words;
	
	public Dictionary() {
		words = new HashMap<String,List<String>>();
	}

	public List<String> anagrams(String word) {
		String key = key(word);
		ArrayList<String> result = new ArrayList<String>();
		if (words.containsKey(key)) 
			for(String anagram : words.get(key)) 
				if(!anagram.equals(word))
					result.add(anagram);
		return result;
	}

	private String key(String word) {
		char[] chars = word.toCharArray();
		for(int i=0; i < chars.length; i++) 
			if(!Character.isLetter(chars[i]))
				chars[i] = ' ';
        Arrays.sort(chars);
        return new String(chars).trim();
	}

	public void add(String word) {
		String key = key(word);
		if(!words.containsKey(key)) 
			words.put(key, new ArrayList<String>());
		words.get(key).add(word);
	}

	public boolean areAnagrams(String a, String b) {
		return key(a).equals(key(b));
	}
}
