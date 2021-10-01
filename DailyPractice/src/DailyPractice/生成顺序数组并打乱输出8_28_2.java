package DailyPractice;

import java.util.Arrays;
import java.util.Random;

/**
 * 练习题:生成一个顺序数组,将这个数组的元素打乱顺序后输出
 * @author zh
 *2021年8月28日 下午7:01:40
 *@description
 */
public class 生成顺序数组并打乱输出8_28_2 {

	public static void main(String[] args) {
		int[] a=new int[10];//先创建一个大小为10的数组
		//用循环先给数组赋值，得到一个顺序数组
		for(int i=0;i<a.length;i++) {
			a[i]=i;
		}
		//输出打乱前的数组
		System.out.println("打乱前的数组："+Arrays.toString(a));
		System.out.println("-------------------");		
		//再用随机数来实现这个打乱的操作
		for (int i = 0; i < a.length; i++) {
			int j=new Random().nextInt(a.length);
			//random().nextInt(int n);返回的是【0，n)的范围的随机数
			//用范围为[0,a.length)的随机数j作下标与a[i]进行交换操作，达到打乱的效果
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		//输出打乱后的数组
		System.out.println("打乱后的数组："+Arrays.toString(a));
	}

}
