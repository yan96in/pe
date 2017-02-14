/**
 * 
 */
package problem;


/**
 * @author yan96in
 *
 */

public class P1 {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();//System.nanoTime();纳秒
		System.out.println(p4());
		long endTime=System.currentTimeMillis();//System.nanoTime();
		System.out.println("运算时间用了"+(endTime-startTime)+"微秒");
	}
	


/*
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
*/
private static int p4(){
	for(int i=999*999;i>100_000;i--){
		if(Util.isPalindrome(i)&&Util.isProductBy(i))return i;
		else continue;
	}
	return 0;
}
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
	private static long p3(long num){
		double max=Math.sqrt(num);
		for(long i=(long) max;i>2;i--){
			if(Util.isFactor(i)&&num%i==0)return i;
			else continue;
		}
		return 1;
	}
	
private static void p2(){
		int sum=0;//从1，2之后开始
		int f1=1,f2=2;
		int tmp=0;
		while(f2<4_000_000){
			if(f2%2==0){
				sum+=f2;
			}
			tmp=f1+f2;
			f1=f2;
			f2=tmp;
		}
		System.out.println(sum);
	}
	
	private static void p1(){
		int sum = 0;
		for (int i = 3; i < 1000; i++) {
			if (i % 3 == 0 | i % 5 == 0) {
				sum += i;
			}
			// if(i%15==0){
			// sum=sum-i;
			// }
		}
		System.out.println(sum);
	}
}
