package DailyPractice;

import java.util.Scanner;

/**
 * 练习题:打印全三角形
需求:接收用户输入的行数,打印对应的全三角形,
 * @author zh
 *2021年8月28日 下午7:18:00
 *@description
 */
public class 打印全三角形8_28_3 {
	public static void main (String[] args) {
		System.out.print("请输入要打印的三角形的行数：");
		int n;
		while(true) {
			n=new Scanner(System.in).nextInt();//接收行数
			if(n<1) {
				System.out.print("错误！重新输入：");
			}else {
					break;
			}
		}
		for(int i=1;i<=n;i++) {//外循环，i等于排数
			for(int j=0;j<n-i;j++) {//内循环1，打印*前的空格，每排空格个数为（intput-i）
				System.out.print(" ");
			}//每排空格打印完就接着打印图案
			for(int j=0;j<2*i-1;j++) {//内循环2，按规律每排的图案个数为（2*i-1）
				System.out.print("*");
			}
			System.out.println();//打印完一排就换行
		}
	}

}
