package DailyPractice;

import java.util.Scanner;

/**
 * 练习题:斐波那契问题
已知:斐波那契数列的前几个数分别为0,1,1,2,3,5…从第三项开始,每一项都等于前两项的和.请接收用户输入的整数n,求出此数列的前n项.
 * @author zh
 *2021年8月31日 下午10:05:45
 *@description
 */
public class 斐波那契问题8_31_3 {

	public static void main(String[] args) {
		//		 0,   1,   1,   2,   3,   5...
		//第一次 num1 num2 num3  
		//第二次	     num1 num2 num3
		//……依次后移，就是我们循环体的意思，最后第n项就是num3
//		
//		int num1=0,num2=1,num3=0;//num3用规律算，不直接赋值出来
//		System.out.println("请输入你要测试的数：");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();//接收用户输入的数
//		//判断输入的数有无问题
//		if(n<1)
//			System.out.println("输入错误！退出！");
//		//判断输入的数是否前两个，因为前两个数我们直接知道且无法用规律算
//		if(n==1)
//			System.out.println(num1);
//		if(n==2) {
//			System.out.println(num2);//输出值
//			System.out.println(num1+","+num2);//输出排列
//		}
//		if(n>2){//第三个数开始
//			System.out.print("改排列为："+num1+","+num2);//与前面的排列拼接在一起
//			for(int i=2;i<n;i++) {
//			num3=num1+num2;
//			num1=num2;
//			num2=num3;
//			System.out.print(","+num3);
//			}
//		}
//		System.out.println();
//		System.out.println("第"+n+"项为："+num3);
		
		
		//输出第n项的值
		int num1=1,num2=1,num3=0; //num3用规律算，不直接赋值出来
		int count=0;//计数器，记一行打印了多少次
		System.out.printf("%12d%12d",num1,num2);//前两个月的兔子数直接输出，因为数据太大所以用%12d固定
		count=count+2;//这里打印了两个月的所以加个2，也可以直接在定义时初始化为2
		for(int i=2;i<40;i++) { //从三月开始输出前四十个月的每月兔子数
		    num3=num1+num2;
		    num1=num2;
		    num2=num3;
		    System.out.printf("%12d",num3);
		    count++;
		    if(count==5){
		        System.out.println(); //一排打印了五个就换行
		        count=0; //然后将count重置为0，继续下一行的打印计数
		    }
		}

	}
}
