package javaproject8_10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年8月10日 上午10:26:11
 *@description
 *10个学生成绩，从小到达输出
 */
public class 冒泡排序8_10 {

	public static void main(String[] args) {
		int[] score=new int[10];
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入十个成绩：");
		for(int i=0;i<10;i++) {
			score[i]=scanner.nextInt();
		}
		
		for(int i=0;i<score.length-1;i++) {
			int flag=1;//优化程序，有时候只冒泡几趟就可以全部排序完
			for(int j=0;j<score.length-1-i;j++) {
				if(score[j]>score[j+1]) {
					int t=score[j];
					score[j]=score[j+1];
					score[j+1]=t;
					flag=0;	
				}
			}
			if(flag==1)
					break;
			System.out.println("第"+(i+1)+"趟冒泡的结果是："+Arrays.toString(score));
		}
		System.out.println("成绩从小到大的排序为："+Arrays.toString(score));
	}

}
