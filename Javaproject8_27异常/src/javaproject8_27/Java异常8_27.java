package javaproject8_27;

import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年8月27日 上午8:48:07
 *@description
 *异常概念演示
 */
public class Java异常8_27 {
	static String name;
	static int score;
	static double average;
	
	public static void main(String[] args) {
//		{//代码1：求姓名name的字符串长度并输出
//			//代码1会产生空指针异常，后面的代码不会执行
//			int length=name.length();
//			System.out.println(length);
//		}
		{//代码2，从控制台输入学生成绩（0-100）存入score，并输出
			//代码2在score时int类型下输入小数会产生异常
			Scanner scanner=new Scanner(System.in);
			System.out.println("请输入成绩：");
			score=scanner.nextInt();
			System.out.println("成绩："+score);
		}

	}

}
