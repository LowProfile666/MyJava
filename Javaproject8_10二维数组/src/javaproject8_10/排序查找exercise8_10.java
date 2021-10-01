package javaproject8_10;

import java.util.Scanner;



/**
 * 
 * @author zh
 *2021年8月10日 下午4:23:19
 *@description
 *输入成绩:98 87 85 92 93 72 80 73 90 96
 *查找是否有考了90分的同学，有则输出true，否则输入false
 *先排序，在二分查找
 */
public class 排序查找exercise8_10 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		int key=90;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入十个同学的成绩：");
		for(int i=0;i<10;i++) {
			arr[i]=scanner.nextInt();
		}
		F(arr);//冒泡排序
		int t=binarySearching(arr,key);//二分查找
		if(t!=-1)
			System.out.println("ture");
		else
			System.out.println("false");
	}
	public static int[] F(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int flag=1;
			for(int j=0;j<arr.length-i;j++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=0;
				}
			}
			if(flag==1)
				break;
		}
		return arr;
	}
	public static int binarySearching(int[] arr,int key) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(key>arr[mid]) {
				left=mid+1;
			}else if(key<arr[mid]) {
				right=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
