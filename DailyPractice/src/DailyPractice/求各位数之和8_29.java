package DailyPractice;

import java.util.Scanner;

/**
 * 练习题:求任意自然数各位数之和
接收用户输入的任意自然数,累计所有位数数字之和
需求:接收用户输入的数,
 * @author zh
 *2021年8月29日 下午7:35:09
 *@description
 */
public class 求各位数之和8_29 {

	public static void main(String[] args) {
		System.out.println("请输入任意一个自然数：");
		int n=new Scanner(System.in).nextInt();//接受一个任意自然数
		int sum=0;//用来存求和后的数
		System.out.print(n+"的各位数之和是：");
		while(n!=0) {
			//算n的每个数，用求模方法得到n的个位数再再加起来，然后将n除以10得到去除个位后的数再赋给n
			sum+=n%10;
			n=n/10;
		}
		System.out.println(sum);
	}

}
