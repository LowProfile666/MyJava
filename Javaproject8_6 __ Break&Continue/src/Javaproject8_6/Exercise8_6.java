package Javaproject8_6;

import java.util.Scanner;
/**
 * 
 * @author zh
 *2021年8月6日 上午11:59:09
 *@description 提示用户输入年份和代表该年第一天是星期几的数字，然后输出该年的日历表
 */
public class Exercise8_6 {
	public static void printTotal(int year,int i) {
		System.out.println("\t"+i+"月 "+year+"年");	
		System.out.println("----------------------");
		System.out.println(" 日  一 二  三  四  五 六 ");
	}
	public static boolean leapYear(int year) {
		if(year%4==0&&year%100!=0||year%400==0)
			return true;
		return false;
	}
	public static int getMonthDay(int i,int year) {
		switch(i) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			if(leapYear(year))
				return 29;
			else 
				return 28;
		default:return 30;
		}
	}
	public static int printMonthDay(int firstDay,int monthDay) {
		//星期几就在前面打印几个空格
		for(int i=1;i<=firstDay;i++) {
			System.out.print("   ");
		}
		for(int i=1;i<=monthDay;i++) {
			System.out.printf("%3d",i);
			firstDay=firstDay+1;
			if(firstDay==7) {
				System.out.print("\n");
				firstDay=0;
			}	
		}
		System.out.println("\n");
		return firstDay;
	}
	public static void main(String[] args) {
		int year;
		int firstDay;//第一天的星期数
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入年份和该年的第一天是星期几：");
		year=scanner.nextInt();
		firstDay=scanner.nextInt();
		//判断平闰
		leapYear(year);
		for(int i=1;i<=12;i++) {//十二个月
		//每月天数
		int monthDay=getMonthDay(i,year);
		//打印表头
		printTotal(year,i);
		//打印表体
		firstDay=printMonthDay(firstDay,monthDay);
		}
	}
}