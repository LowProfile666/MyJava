package DailyPractice;

import java.util.Scanner;

/**
 * 练习题:打印水仙花数
水仙花数：是指一个三位数，其各位数字立方和等于该数字本身
例如：153就是一个水仙花数，因为153 = 1³ + 5³ + 3³
 * @author zh
 *2021年9月1日 下午11:05:12
 *@description:
 */
public class 水仙花数9_1_2 {

	public static void main(String[] args) {
		//判断一个数是否是水仙花数
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个要判断的三位数：");
		int n=scanner.nextInt();
		int g,s,b;//个位十位百位
		g=n%10;
		s=n%100/10;
		b=n/100;
		if(g*g*g+s*s*s+b*b*b==n) {
			System.out.println("它是一个水仙花数！");
			System.out.println(n+"="+b*b*b+"*"+s*s*s+"*"+g*g*g);
		}
		else {
			System.out.println("它不是一个水仙花数！");
		}
		
		//打印所有的水仙花数
		System.out.println("100-999所有的水仙花数：");
		for(int i=100;i<1000;i++) {
			//水仙花数限制是三位数，所以范围是100-999
			int g1,s1,b1;
			g1=i%10;
			s1=i%100/10;
			b1=i/100;
			if(g1*g1*g1+s1*s1*s1+b1*b1*b1==i) {
				System.out.println(i+"="+b1*b1*b1+"*"+s1*s1*s1+"*"+g1*g1*g1);
			}
		}
		System.out.println(5.3/3);
	}
	

}
