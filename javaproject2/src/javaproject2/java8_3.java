package javaproject2;

import java.util.Scanner;
/**
 * 
 * @author zh
 *2021年8月3日 上午11:31:45
 *@description输入半径，计算输出园的面积
 */
public class java8_3 {
public final static double PI=3.1415926;//定义常量
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;//面积
		double radius;//半径
		System.out.println("请输入半径：\n");
		Scanner scanner=new Scanner(System.in);
		radius=scanner.nextDouble();
		area=PI*radius*radius;
		System.out.println("半径为"+radius+"园的面积是"+area);
	}
}
