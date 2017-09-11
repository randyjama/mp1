package stringhelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromicSubstringTest {

	@Test
	public void test1() {
		assertEquals(true, StringUtility.hasPalindromicSubstring("abba"));
	}
	
	@Test
	public void test2() {
		assertEquals(true, StringUtility.hasPalindromicSubstring("I know MalayalaM!"));
	}
	
	@Test
	public void test3() {
		assertEquals(false, StringUtility.hasPalindromicSubstring("?Regae?"));
	}

	@Test
	public void test4() {
		assertEquals(true, StringUtility.hasPalindromicSubstring("eager regae?!"));
	}

	@Test
	public void test5() {
		assertEquals(false, StringUtility.hasPalindromicSubstring("&"));
	}

	@Test
	public void test6() {
		assertEquals(false, StringUtility.hasPalindromicSubstring(""));
	}

	@Test
	public void test7() {
		assertEquals(true, StringUtility.hasPalindromicSubstring("   "));
	}

	@Test
	public void test8() {
		assertEquals(false, StringUtility.hasPalindromicSubstring("ab"));
	}
	
	@Test
	public void test9() {
		assertEquals(true, StringUtility.hasPalindromicSubstring("where ama i deed?>"));
	}
}