package javaproject3;

import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年8月5日 下午3:29:01
 *@description用do while编写程序，从控制台输入学生七门成绩，
 *计算出总分和平均分
 */
public class Do_while8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score=0.0;
		double total=0.0;
		int i=1;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		do {
			System.out.println("请输入学生的第"+i+"门成绩：");
			score=scanner.nextDouble();
			total+=score;
			i++;
		}while(i<=7);
		double average=total/7;
		//System.out.println("平均分为"+average+"总分为"+total);
		System.out.printf("总分为：%8.2f,平均分为：%5.2f",total,average);
		//%8.2f=总位数为8，小数位为2
	}
}
