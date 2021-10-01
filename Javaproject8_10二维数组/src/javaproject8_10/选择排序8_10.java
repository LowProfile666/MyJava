package javaproject8_10;

import java.util.Arrays;



public class 选择排序8_10 {

	public static void main(String[] args) {
		double[] arr=new double[] {87,98,16,57,45,76,61,72,36,56};
		System.out.println("排列前的数组："+Arrays.toString(arr));
		//double[] scores={9,7,5,4,6,8,1,28,7};
		 // Arrays.sort(scores);//快速排序算法升序排序整个数组
		 // System.out.println(Arrays.toString(scores));
		sort(arr);
	}
	public static double[] sort(double[] arr) {
		for(int i=1;i<=arr.length-1;i++) {
			//1.第i趟选择
			int maxIndex=0;
			for(int j=1;j<=arr.length-i;j++) {
				if(arr[j]>arr[maxIndex]) {
					maxIndex=j;
				}
			}
			//交换
			if(maxIndex!=arr.length-i) {
				double temp=arr[arr.length-i];
				arr[arr.length-i]=arr[maxIndex];
				arr[maxIndex]=temp;
			}
			//2.输出第i趟排序结果
			System.out.println("第"+i+"趟的排序结果是"+Arrays.toString(arr));
	}
		return arr;
	}
}

