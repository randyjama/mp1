package stringhelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormatNamesTest {

	@Test
	public void test1() {
		assertEquals("Alahmad, Bader N. A.", StringUtility.formatName("  bader n...  ahMa  alahmad "));
	}

	@Test
	public void test2() {
		assertEquals("Al, B. N. A. A. X. A. A. A. ,.",
				StringUtility.formatName("B. Naim A. a x  aa \naaaa aaaaaaa , aL"));
	}

	@Test
	public void test3() {
		assertEquals("Affleck, Ben", StringUtility.formatName("  bEN    aFfLeCK "));
	}

	@Test
	public void test4() {
		assertEquals("Afflek, B E. G. .. ..", StringUtility.formatName("  b  eN geZA ... .x.      aFfLeK "));
	}

	@Test
	public void test5() {
		assertEquals("Fa,,, Cc C. C. C. ,. ,.", StringUtility.formatName("cc c c cC , ,,  fa,,  "));
	}

	@Test
	public void test6() {
		assertEquals(",, Simon F. Z.", StringUtility.formatName("simon   f  zhoU , "));
	}

	@Test
	public void test7() {
		assertEquals("", StringUtility.formatName("      "));
	}

	@Test
	public void test8() {
		assertEquals("", StringUtility.formatName(""));
	}

	@Test
	public void test9() {
		assertEquals("Sathish", StringUtility.formatName("  sathiSH  "));
	}

	@Test
	public void test10() {
		assertEquals("@@@, 12. ,. ,. ,. ,. !.", StringUtility.formatName("12. , ,  \t  ,, ,,, !!!3 @@@ \t"));
	}

}
