package javaproject8_9;

import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年8月9日 下午2:51:58
 *@description 求阶乘：输出0-10的阶乘
 */
public class 递归8_9 {

	public static int F(int n) {
		if(n==1) {
			return 1;
		}
		return n*F(n-1);
	}
	public static void main(String[] args) {
		/*int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		n=scanner.nextInt();
		int ret=F(n);
		System.out.println(n+"的阶乘是："+ret);
*/
		//输出1-10的阶乘
		int n=0;
		for(n=1;n<=10;n++) {
			int ret=F(n);
			System.out.println(n+"!="+ret);
		}
	}

}
