package DailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * 练习题：模拟双色球生成案例
需求：体彩中有一项是双色球，要求在1-33号共33个红色球里选出6个，1-16号共16个蓝色球中选出一个作为中奖号码，请实现这个需求
 * @author zh
 *2021年8月28日 下午10:01:53
 *@description
 */
public class 模拟双色球8_28_4 {

	public static void main(String[] args) {
		int[] red=new int[33];//红色球数组
		int[] blue=new int[16];//蓝色球数组
		//先给两个数组赋值
		for(int i=1;i<=red.length;i++) {
			red[i-1]=i;//因为这里循环从i=1开始，i的最大值是33，red[33]会产生错误所以用[i-1]
		}
		for(int i=1;i<=blue.length;i++) {
			blue[i-1]=i;//因为这里循环从i=1开始，i的最大值是33，red[33]会产生错误所以用[i-1]
		}
		int[] award=new int[7];//中奖号码数组，红6蓝1
		for(int i=0;i<award.length;i++) {
			//用随机数
			//random().nextInt(int n);返回的是【0，n)的范围的随机数，为了不让号码里有0存在，所以在其后加个1。
			if(i<6) {//只需要六个红色球
				award[i]=new Random().nextInt(red.length)+1;//红球随机号数存在中奖号码里
				continue;//返回到循环判断处。开始下一次循环
			}else {//这是当i=6时，随后i++等于7就退出循环
				award[i]=new Random().nextInt(blue.length)+1;//篮球随机号数存在中奖号码里
			}
		}
		//可以使用循环遍历数组输出号码：
		System.out.print("本期中奖号码是：");
		for (int i = 0; i < award.length; i++) {
			System.out.print(award[i]+" ");
		}
		//也可以直接使用Arrays.toString(array)方法输出
		System.out.println("本期中奖号码是："+Arrays.toString(award));
		/*用此需要在开头加一句：import java.util.ArrayList;导入相关类*/
	}

}
