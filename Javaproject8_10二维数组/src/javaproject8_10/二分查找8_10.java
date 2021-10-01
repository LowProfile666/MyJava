package javaproject8_10;

import java.util.Scanner;

public class 二分查找8_10 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int key;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入要查找的数：");
		key=scanner.nextInt();
		int t=binarySearching(arr,key);
		if(t!=-1)
			System.out.println("找到了，"+key+"的下标是："+t);
		else
			System.out.println("找不到");
	}
	public static int binarySearching(int[] arr,int key) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(key>arr[mid]) {
				left=mid+1;
			}else if(key<arr[mid]){
				right=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
