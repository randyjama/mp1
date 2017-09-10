package stringhelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecodeTest {

	@Test
	public void test1() {
		assertEquals("       ", StringUtility.decode("3 4 "));
	}

	@Test
	public void test2() {
		assertEquals("7773333333", StringUtility.decode("3773"));
	}

	@Test
	public void test3() {
		assertEquals("sss00", StringUtility.decode("0a3s20"));
	}

	@Test
	public void test4() {
		assertEquals("!!!!!!!!!!!!7wwwwwwwwwppppp", StringUtility.decode("3!9!179w5p"));
	}

	@Test
	public void test5() {
		assertEquals("", StringUtility.decode("0a0x00"));
	}

	@Test
	public void test6() {
		assertEquals("1111111n", StringUtility.decode("711n"));
	}

}
