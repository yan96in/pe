/**
 * 
 */
package problem;

/**
 * @author yan96in
 *
 */
public class Util {
	// 判断是否为质数
	public static boolean isFactor(long num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i != 0)
				return false;
			else
				continue;
		}
		return true;
	}

	// TODO
	// 返回num在digit位的数，返回-1表示无此位
	public static int digitNum(int num, int digit) {
		if (Math.pow(10, digit) > num)
			return -1;

		return -1;
	}

	// 判断输入是否是回文
	public static boolean isPalindrome(Object object) {
		String s = String.valueOf(object);
		int len = s.length();
		for (int i = 0; i <= len / 2; i++) {
			if (s.charAt(i) == s.charAt(len - 1 - i))
				continue;
			else
				return false;
		}
		return true;
	}

	// 判断一个整数是否是由两个百位数相乘所得
	public static boolean isProductBy(int num) {
		if (num > 999 * 999)
			return false;// 大于范围直接返回false
		if (num < 10000)
			return false;
		for (int i = 100; i < 1000; i++) {
			int temp=num%i;
			if (num%i==0) {
				if(num/i>99&&num/i<1000){
					System.out.println(num+"="+i + "*" + num / i);
					return true;
				}
			} else
				continue;
		}
		return false;
	}
}
