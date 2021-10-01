package javaproject8_10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年8月10日 下午3:00:34
 *@description 输入六个学生成绩：68 88 99 50 59 73
 *利用选择排序将由小到大排序，输出排序过程
 */
public class Sort_exercise8_10 {

	public static void main(String[] args) {
		double[] a=new double[6];
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入6位学生的成绩：");
		for(int i=0;i<6;i++) {
			a[i]=scanner.nextDouble();
		}
		sort(a);
	}
	public static double[] sort(double[] a) {
		for(int i=1;i<=a.length-1;i++) {
			int maxIndex=0;
			for(int j=1;j<=a.length-i;j++) {
				if(a[j]>a[maxIndex]) {
					maxIndex=j;
				}	
			}
			if(maxIndex!=a.length-i) {
					double t=a[a.length-i];
					a[a.length-i]=a[maxIndex];
					a[maxIndex]=t;
				}
			System.out.println("第"+i+"趟排序的结果是："+Arrays.toString(a));
		}
		return a;
	}
}
