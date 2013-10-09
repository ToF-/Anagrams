package tof;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class DictionaryTest {

	private Dictionary dictionary;
	
	@Before
	public void setUp() {
		dictionary = new Dictionary();
	}

	@Test
	public void ShouldYieldEmptyListWhenNoAnagramFound() {
		assertEquals(new ArrayList<String>(), dictionary.anagrams("notaword"));
	}

	// @Test
	public void ShouldReturnAKnownAnagram() {
		dictionary.add("cinema");
		assertEquals(Arrays.asList("cinema"), dictionary.anagrams("iceman"));
	}
	@Test
	public void ShouldReturnAnyKnownAnagram() {
		dictionary.add("life");
		assertEquals(Arrays.asList("life"), dictionary.anagrams("file"));
	}
	@Test
	public void ShoudReturnSeveralKnownAnagrams() {
		dictionary.add("cinema");
		dictionary.add("anemic");
		assertEquals(Arrays.asList("anemic","cinema"), dictionary.anagrams("iceman"));
	}
}