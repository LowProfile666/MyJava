package Javaproject8_7;

import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author zh
 *2021年8月7日 上午10:44:59
 *@description 加减乘除程序
 */
public class Mehod8_7_3 {

	public static double F(double num1,double num2,char op) {
		double result=0;
		if(op=='+') {
			result=num1+num2;
		}else if(op=='-') {
			result=num1-num2;
		}else if(op=='*') {
			result=num1*num2;
		}else if(op=='/') {
			result=num1/num2;
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		double num1,num2;
		//char op;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("输入两个数：");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		System.out.println("请输入运算符：");
	    //String op=sc.nextLine();//从键盘读入字符串数据
		char op=(char)System.in.read();
		F(num1,num2,op);
		System.out.println(F(num1,num2,op));
	}

}
