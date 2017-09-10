package stringhelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramsTest {

	@Test
	public void test1() {
		assertEquals(false, StringUtility.anagrams("aaa", "a"));
	}

	@Test
	public void test2() {
		assertEquals(false, StringUtility.anagrams("aaa", "aa"));
	}

	@Test
	public void test3() {
		assertEquals(true, StringUtility.anagrams("aaa", "aaa"));
	}

	@Test
	public void test4() {
		assertEquals(false, StringUtility.anagrams("aaaa", "aaa"));
	}

	@Test
	public void test5() {
		assertEquals(false, StringUtility.anagrams(" Aa b ", "ab"));
	}

	@Test
	public void test6() {
		assertEquals(false, StringUtility.anagrams(" Aa b ", "ab"));
	}

	@Test
	public void test7() {
		assertEquals(false, StringUtility.anagrams(" Aa b ", "Ab   A"));
	}

	@Test
	public void test8() {
		assertEquals(false, StringUtility.anagrams(" I am a blackstar ?", "ras blackt i am a? "));
	}

	@Test
	public void test9() {
		assertEquals(true, StringUtility.anagrams(" I am a blackstar ?", "ras blackt I  m aa?"));
	}

	@Test
	public void test10() {
		assertEquals(true, StringUtility.anagrams(" I am a blackstar ?", "b l s a ?ra kcItama"));
	}

	@Test
	public void test11() {
		assertEquals(true, StringUtility.anagrams("dormitory ", "dirty room"));
	}

	@Test
	public void test12() {
		assertEquals(false, StringUtility.anagrams("clint eastwood", "old west action"));
	}

	@Test
	public void test13() {
		assertEquals(false, StringUtility.anagrams("evangelist", "evil's agent"));
	}

}
