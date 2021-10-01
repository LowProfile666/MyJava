package Javaproject8_7;

import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年8月7日 上午10:03:16
 *@description 通过方法降序输出三个分数
 */
public class Method_8_7 {

	public static void F(double score1,double score2,double score3) {
		if(score1>score2) {
			double t=score1;
			score1=score2;
			score2=t;
		}
		if(score1>score3) {
			double t=score1;
			score1=score3;
			score3=t;
		}
		if(score2>score3) {
			double t=score2;
			score2=score3;
			score3=t;
		}
		System.out.printf("%.2f<%.2f<%.2f",score1,score2,score3);
	}
	public static void main(String[] args) {
		double score1,score2,score3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入三个分数：");
		score1=scanner.nextDouble();
		score2=scanner.nextDouble();
		score3=scanner.nextDouble();
		F(score1,score2,score3);
	}

}
