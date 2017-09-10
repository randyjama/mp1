package stringhelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void test1() {
		assertEquals(false, StringUtility.isPalindrome("I am aliveevilam aI"));
	}

	@Test
	public void test2() {
		assertEquals(true, StringUtility.isPalindrome("aibohphobia"));
	}

	@Test
	public void test3() {
		assertEquals(false, StringUtility.isPalindrome("  ,. ., "));
	}

	@Test
	public void test4() {
		assertEquals(true, StringUtility.isPalindrome(""));
	}

	@Test
	public void test5() {
		assertEquals(true, StringUtility.isPalindrome("    "));
	}

	@Test
	public void test6() {
		assertEquals(true, StringUtility.isPalindrome("z"));
	}

	@Test
	public void test7() {
		assertEquals(false, StringUtility.isPalindrome("aAccX' 'xccAa"));
	}

	@Test
	public void test8() {
		assertEquals(true, StringUtility.isPalindrome("\n\\     \\\n"));
	}

	@Test
	public void test9() {
		assertEquals(false, StringUtility.isPalindrome("(([ [] ]))"));
	}
}
