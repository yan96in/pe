/**
 * 
 */
package problem;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author yan96in
 *
 */
public class UtilTest {

	@Test
	public void isFactorTest() {
		assertTrue(Util.isFactor(29));
		assertFalse(Util.isFactor(400));
	}
@Test
public void digitNumTest(){
	assertEquals(3,Util.digitNum(123, 1));
	assertEquals(3,Util.digitNum(123, 2));
	assertEquals(3,Util.digitNum(123, 3));
}
@Test
public void isPalindromeTest(){
	assertTrue(Util.isPalindrome(101));
	assertTrue(Util.isPalindrome(333));
	assertFalse(Util.isPalindrome(122));
	assertFalse(Util.isPalindrome(103));
}
@Test 
public void isProductByTest(){
	assertFalse(Util.isProductBy(995599));
	assertTrue(Util.isProductBy(10000));
	assertTrue(Util.isProductBy(40000));
	assertFalse(Util.isProductBy(9999));
	assertFalse(Util.isProductBy(999*999+1));
}
}
