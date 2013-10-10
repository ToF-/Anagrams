package tof;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
		assertEquals(Collections.emptyList(), dictionary.anagrams("notaword"));
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
		List<String> anagrams = dictionary.anagrams("iceman"); 
		assertTrue(anagrams.contains("cinema"));
		assertTrue(anagrams.contains("anemic"));
	}
	@Test
	public void ShoulReturnAnagramBasedOnSameLetters() {
		dictionary.add("life");
		dictionary.add("deal");
		assertEquals(Arrays.asList("deal"), dictionary.anagrams("lade"));
	}
}