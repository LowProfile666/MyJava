package javaproject8_9;

import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年8月9日 下午3:58:41
 *@description:读入10个学生的成绩，找出然他们中最大值，并统计最大值出现的次数
 */
public class 数组8_9 {

	public static void Max(double scores[]) {
		double max=scores[0];
		int count=1;
		for(int i=0;i<10;i++) {
			if(max<scores[i]) {
				max=scores[i];
				count=1;
			}else if(max==scores[i]) {
				count++;
			}
		}
		System.out.println("这些成绩的最大值是："+max);
		System.out.println("出现的次数是："+count);
		
	}
	public static void main(String[] args) {
		double[] scores=new double[10];
		Scanner scanner =new Scanner(System.in);
		for(int i=0;i<scores.length;i++) {
			System.out.print("请输入第"+(i+1)+"个学生的成绩：");
			scores[i]=scanner.nextDouble();
		}
		Max(scores);
		
		
	}

}
