package tof;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DictionaryTest {

	@Test
	public void ShouldYieldEmptyListWhenNoAnagramFound() {
		Dictionary dictionary = new Dictionary();
		assertEquals(new ArrayList(), dictionary.anagrams("notaword"));
	}
}