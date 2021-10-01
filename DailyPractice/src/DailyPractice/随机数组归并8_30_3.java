package DailyPractice;

import java.util.Scanner;
import java.util.Arrays;

/**
 * 练习题： 随机数组的归并问题
需求：生成两个任意的随机数组，并将这两个数组按照数字大小按顺序归并到一个新数组中
 * @author zh
 *2021年8月30日 下午1:12:35
 *@description
 */
public class 随机数组归并8_30_3 {

	public static void main(String[] args) {
		//先定义三个数组
		int[] arr1=new int[5];
		int[] arr2=new int[5];
		int[] New=new int[10];
		Scanner scanner=new Scanner(System.in);
		//先给第一个数组赋值
		System.out.print("请给第一个数组赋值，最多"+arr1.length+"个,以空格隔开：");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scanner.nextInt();
		}
		//输出第一个数组看看
		System.out.println("第一个数组："+Arrays.toString(arr1));
		System.out.println("-------------------------------------------------");
		//给第二个数组赋值
		System.out.print("请给第二个数组赋值，最多"+arr2.length+"个,以空格隔开：");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scanner.nextInt();
		}
		//输出第二个数组看看
		System.out.println("第二个数组："+Arrays.toString(arr2));
		System.out.println("-------------------------------------------------");
		//给新数组赋值
		for(int i=0;i<New.length;i++) {
			if(i<arr1.length)
				New[i]=arr1[i];
			if(i>=arr1.length) {
				New[i]=arr2[i-5];
			}
		}
		//输出新数组看看
		System.out.println("排序前的新数组："+Arrays.toString(New));
		System.out.println("-------------------------------------------------");
		//给新数组排序--冒泡排序法
		for(int i=0;i<New.length-1;i++) {
			for(int j=0;j<New.length-1-i;j++) {
				if(New[j]>New[j+1]) {
				int tmp=New[j];
				New[j]=New[j+1];
				New[j+1]=tmp;
				}
			}
		}
		//输出最终结果数组
		System.out.println("排序后的新数组："+Arrays.toString(New));
	}
}
