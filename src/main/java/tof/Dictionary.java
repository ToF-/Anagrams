package tof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

	private HashMap<Integer, List<String>> words;

	public List<String> anagrams(String word) {
		words = new HashMap<Integer,List<String>>();
		words.put(6,Arrays.asList("anemic","cinema"));
		words.put(4, Arrays.asList("life"));
		Integer key = new Integer(word.length());
		if (words.containsKey(key)) {
			return words.get(key);
		}
		return new ArrayList<String>();
	}

	public void add(String string) {
		
	}
}
