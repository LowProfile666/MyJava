package DailyPractice;
/**
 * 练习题:求一个数组中所有元素的最大值
 * @author zh
 *2021年8月30日 下午12:55:52
 *@description
 */
public class 求数组元素最大值8_30 {

	public static void main(String[] args) {
		//先定义一个数组，内容随机
		int[] arr= {0,23,24,43,21,66,876,990,32,865,998};
		//再设置一个最大值
		int max=arr[0];
		//然后将这个最大值与数组元素一一比较
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];//将大的值赋给max
			}
		}
		//输出max
		System.out.println("这个数组的最大值是："+max);
	}

}
