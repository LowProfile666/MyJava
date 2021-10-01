package Javaproject8_7;

import java.util.Scanner;
/**
 * 
 * @author zh
 *2021年8月7日 上午10:19:23
 *@description 调用方法返回最大值输出
 */
public class Method8_7_2 {

	public static double Max(double score1,double score2) {
		if(score1>=score2)
			return score1;
		else {
			return score2;
		}
	}
	public static void main(String[] args) {
		double score1,score2;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入俩个数：");
		score1=sc.nextDouble();
		score2=sc.nextDouble();
		double max=Max(score1,score2);
		System.out.println("最大值为："+max);
		System.out.println("最大值为："+Max(score1,score2));
	}

}
