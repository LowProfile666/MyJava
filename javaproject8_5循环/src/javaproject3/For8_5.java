package javaproject3;

import java.util.Scanner;
/**
 * 
 * @author zh
 *2021年8月5日 下午4:23:06
 *@description 用for循环从控制台输入10个学生的成绩，计算平均分
 */
public class For8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score;
		double average;
		double total=0;
		Scanner scanner=new Scanner(System.in);
		int i=1;
		for(i=1;i<=10;i++) {
			System.out.println("请输入第"+i+"个学生的成绩：");
			score=scanner.nextDouble();
			total+=score;
		}
		average=total/10;
		System.out.println("这十个学生的平均分是："+average);
	}

}
