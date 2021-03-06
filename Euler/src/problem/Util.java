/**
 * 
 */
package problem;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author yan96in
 *
 */
public class Util {
	// 读取文件，用于大位数字的录入
	public int[] ints() {
		// Path path=Paths.get("").;
		return null;
	}

	// 计算自幂数之和
	public static BigInteger sumOfSelfPowers(long num) {
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger tmp;
		for (long i = 1; i < num + 1; i++) {
			sum=sum.add(BigInteger.valueOf(i).pow((int) i));//必须写上赋值符sum=接收对象，不然sum值不会变
		}
		return sum;
	}

	// 计算阶乘
	public static BigInteger factorial(long num) {
		BigInteger factor = new BigInteger("1");
		BigInteger bi;
		for (long i = 1; i < num + 1; i++) {
			bi = BigInteger.valueOf(i);
			factor=factor.multiply(bi);
		}
		return factor;
	}

	// 计算整除数之和
	public static int sumOfDivisors(int num) {
		int sum = 1;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				sum += i;
		}
		return sum;
	}

	// 计算给定整数的除数个数
	// 算法效率为O(n^2),效率极低，有待改进
	public static int findDivisors(long num) {

		if (num == 1)
			return 1;
		if (num < 4)
			return 2;// 2,3返回2
		if (num == 4)
			return 3;
		int count = 1;
		for (long i = 3; i <= num / 3; i++) {
			if (num % i == 0)
				count++;
		}
		if (num % 2 == 0)
			count += 2;// 2和num/2也是整除数.
		count++;// 本身也是
		return count;
	}

	// 将用空格分割的字符串转成数组存储，并以逗号分割打印
	public static void splitToArray(String s) {
		String[] array = s.split(" ");
		for (String st : array) {
			System.out.print(st + ",");
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
