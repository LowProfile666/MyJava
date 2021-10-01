package DailyPractice;

import java.util.Scanner;

/**
 * 练习题:接收用户输入的数字,判断在此范围内质数的个数,并输出这些质数
 * @author zh
 *2021年8月28日 下午6:34:02
 *@description
 */
public class 求质数个数8_28 {

	public static void main(String[] args) {
		System.out.println("请输入范围上限：");
		int n;
		while(true) {
			n=new Scanner(System.in).nextInt();//用来接受用户的输入
			if(n<=1) {
				System.out.println("输入错误！请输入大于1的自然数：");
			}else {
				break;
			}
		}
		int count=0;//计数，计质数出现次数
		int count1=0;//计数，计一排打印了质数多次
		for(int i=2;i<=n;i++) {//1和0不是质数所以从2开始循环，遍历[2，n]
			int a=F(i);//调用判断是否质数的方法
			if(a==1){
				count++;//如果是质数就加1
				System.out.print(i+"是质数\t");//输出每个质数
				count1++;
				if(count1%5==0)
					System.out.println();//达到一排最多打印五句话的效果
			}
		}
		System.out.println();
		System.out.println("在0到"+n+"的范围内的质数个数为："+count);
	}
	//判断质数的方法
	public static int F(int i) {
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0)
				return -1;//不是质数返回-1
		}
		return 1;//是质数返回1
	}

}
