package javaproject8_10;

import java.util.Scanner;
/**
 * 
 * @author zh
 *2021年8月25日 上午11:28:45
 *@description
 */
public class 线性查找8_10 {

	public static void main(String[] args) {
		int[] arr= {89,87,85,96,78,45,62,85,88};
		int key;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入查找的数：");
		key=scanner.nextInt();
		int t=linearSearching(arr,key);
		if(t!=-1)
			System.out.println("找到了，"+key+"的下标是"+t);
		else
			System.out.println("找不到");
	}
	public static int linearSearching(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
}
