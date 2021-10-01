package DailyPractice;

import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年8月27日 下午6:39:36
 *@description
 *练习题:求数字阶乘(for循环版)
需求:接收用户输入的数字,计算该数字的阶乘结果
已知:负数不可以有阶乘,0的阶乘结果是1,
5 ! = 5 x 4 x 3 x 2 x 1
 */
public class 求数字阶乘for8_27 {

	public static void main(String[] args) {
		int input;//用来接受用户输入的数字
		int sum;//表示阶乘
		System.out.println("请输入一个整数，求阶乘：");
		input=new Scanner(System.in).nextInt();
		if(input>0) {
			sum=1;
			System.out.print(input+"!"+"=");
			for(int i=1;i<=input;i++) {
				sum*=i;
				if(i==input) 
					System.out.println(i+"="+sum);
				else
					System.out.print(i+"*");
			}
			System.out.println(input+"!"+"="+sum);
		}else if(input<0) {
			System.out.println("负数没有阶乘！");
		}else {
			System.out.println("0的阶乘是1！");
		}
	}

}
