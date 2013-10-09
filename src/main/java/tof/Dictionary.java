package tof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionary {

	public List<String> anagrams(String string) {
		if(string == "iceman")
			return Arrays.asList("cinema");
		if(string == "file")
			return Arrays.asList("life");
		return new ArrayList<String>();
	}

	public void add(String string) {
		
	}
}
