package stringhelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumOccurrencesTest {

	@Test
	public void test1() {
		assertEquals(1, StringUtility.countOccurrences("xYxyXxhelllllolll", "ell"));
	}

	@Test
	public void test2() {
		assertEquals(6, StringUtility.countOccurrences("xYxyXxhelllllolll", "ll"));
	}

	@Test
	public void test3() {
		assertEquals(4, StringUtility.countOccurrences("xYxyXxhelllllolll", "lll"));
	}

	@Test
	public void test4() {
		assertEquals(0, StringUtility.countOccurrences("xYxyXxhelllllolll", "helll "));
	}

	@Test
	public void test5() {
		assertEquals(0, StringUtility.countOccurrences("xYxyXxhelllllolll", "xyx"));
	}

	@Test
	public void test6() {
		assertEquals(1, StringUtility.countOccurrences("xYxyXxhelllllolll", "Yxy"));
	}

	@Test
	public void test7() {
		assertEquals(0, StringUtility.countOccurrences("xYxyXxhelllllolll", "xYX"));
	}

	@Test
	public void test8() {
		assertEquals(1, StringUtility.countOccurrences("xYxyXxhelllllolll", "xYx"));
	}

	@Test
	public void test9() {
		assertEquals(0, StringUtility.countOccurrences("xYxyXxhelllllolll", "yXX"));
	}

	@Test
	public void test10() {
		assertEquals(1, StringUtility.countOccurrences("    ", "    "));
	}

	@Test
	public void test11() {
		assertEquals(0, StringUtility.countOccurrences("    ", "\t"));
	}

	@Test
	public void test12() {
		assertEquals(0, StringUtility.countOccurrences("    ", "     "));
	}

	@Test
	public void test13() {
		assertEquals(6, StringUtility.countOccurrences("auoeunboboo:-):)eubobob, !bo\tb0ntonethboboboboB", "bob"));
	}

	@Test
	public void test14() {
		assertEquals(5, StringUtility.countOccurrences("auoeunboboo:-):)eubobob, !bo\tb0ntonethboboboboB", "obo"));
	}

	@Test
	public void test15() {
		assertEquals(3, StringUtility.countOccurrences("auoeunboboo:-):)eubobob, !bo\tb0ntonethboboboboB", "obob"));
	}

	@Test
	public void test16() {
		assertEquals(1, StringUtility.countOccurrences("auoeunboboo:-):)eubobob, !bo\tb0ntonethboboboboB", "o\tb"));
	}

	@Test
	public void test17() {
		assertEquals(0, StringUtility.countOccurrences("auoeunboboo:-):)eubobob, !bo\tb0ntonethboboboboB", ",!"));
	}

	@Test
	public void test18() {
		assertEquals(0, StringUtility.countOccurrences("auoeunboboo:-):)eubobob, !bo\tb0ntonethboboboboB",
				"auoeunboboo:-):)eubobob, !bo\tb0ntonethboboboboB "));
	}

}
