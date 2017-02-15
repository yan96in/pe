/**
 * 
 */
package problem;

/**
 * @author yan96in
 *
 */
public class Util {

	public static void splitToArray(String s) {
		String[] array = s.split(" ");
		for (String st : array) {
			System.out.print(st+",");
		}
	}

	// 判断是否为质数
	public static boolean isFactor(long num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
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
			if (s.charAt(i) != s.charAt(len - 1 - i))
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
			int temp = num % i;
			if (num % i == 0) {
				if (num / i > 99 && num / i < 1000) {
					System.out.println(num + "=" + i + "*" + num / i);
					return true;
				}
			}
		}
		return false;
	}

	// 计算一个数字中相连几个数字相乘所得积的最大值
	public static long adjacentDigitProduct(String s, int digit) {
		long maxProduct = 0;// 必须是long型的，int型的取值范围是正负2的31次方，肯定小于题目中的范围（9的13次方）
		for (int i = 0; i <= s.length() - digit; i++) {
			long product = 1;
			for (int j = i; j < i + digit; j++) {
				product *= Long.parseLong(String.valueOf(s.charAt(j)));
				if (product == 0)
					break;// 如果积已经为0，直接跳出循环
				// System.out.println(s.charAt(j));
			}
			if (product > maxProduct) {
				maxProduct = product;
				// System.out.println(maxProduct);
			}
		}
		return maxProduct;
	}
}
