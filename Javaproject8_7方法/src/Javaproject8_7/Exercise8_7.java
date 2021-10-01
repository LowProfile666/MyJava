package Javaproject8_7;

import java.awt.print.Printable;
import java.time.MonthDay;
import java.util.Scanner;


/**
 * 
 * @author zh
 *2021年8月7日 下午3:12:35
 *@description:
 *已知1901年1月1日为星期二，编写一个程序，提示用户输入1901年后的年份
 *然后显示输出该年的日历
 * */
public class Exercise8_7 {
	 public static void main(String[] args) {
		 int year;
		 int firstDay;//年的第一天,1901.1.1=2
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("请输入大于1901的年份：");
		 year=scanner.nextInt();
		 		 
		 //是否平闰
		 isLeapYear(year);
		 
		 //每年天数
		 getYearDays(year);
		 
		 //打印
		 print(year);


	}
	 public static int isLeapYear(int year) {
		 if((year%4==0&&year%100!=0)||(year%400==0)) {
			 return 1;//闰年
		 }else {
			return 0;//平年
		}
	 }
	 public static int getYearDays(int year) {
		 if(isLeapYear(year)==1) {
			 return 366;
		 }else {
			return 365;
		}
	 }
	 public static int getMonthDay(Integer year,int i) {
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
			 if(isLeapYear(year)==1)
				 return 29;
			 else {
				return 28;
			}
			 default:return 30;
		 }
	 }
	 public static int getFirstDay(int year) {
		 int sum=0;
		 for(int i=1901;i<year;i++) {
				 if(isLeapYear(year)==1) {
					 sum+=366;
			 }else {
				sum+=365;
			}
		 }
		 return sum%7; 
	 }
	 public static void print(int year) {
		 int firstDay=2+getFirstDay(year);
		 
		 for(int i=1;i<=12;i++) {
			 System.out.println("\t\t\t"+i+"月"+year+"年");
			 System.out.println("==================================================");
			 System.out.println("日\t一\t二\t三\t四\t五\t六");
			 
			 for(int j=0;j<firstDay;j++) {
				 System.out.print("\t");
			 }
			 
			 int monthDay=getMonthDay(year,i);
			 for(int j=1;j<=monthDay;j++) {
				 System.out.print(j+"\t");
				 firstDay++;
				 if(firstDay==7) {
					 System.out.print("\n");
					 firstDay=0;
				 }
			 }
			 System.out.print("\n");
		 }
	 }
}
