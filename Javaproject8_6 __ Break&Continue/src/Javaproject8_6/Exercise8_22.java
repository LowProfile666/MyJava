package Javaproject8_6;
import java.awt.print.Printable;
import java.util.Scanner;
/***
 * 
 * @author zh
 *2021年8月22日 下午5:32:27
 *@description
 *已知1901年1月1日为星期二，编写一个程序，提示用户输入1901年一月后的年和月份
 *然后显示输出该年的月历
 */
public class Exercise8_22 {

	
	public static void main(String[] args) {
		int year;
		int month;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("请输入1901年1月后的年份：");
		    year=scanner.nextInt();
		    if(year<1901)
		    	System.out.print("输入错误，");
		}while(year<1901);
		do {
			System.out.println("请输入1901年1月后的月份：");
		    month=scanner.nextInt();
		    if(month<=0||month>12)
		    	 System.out.print("输入错误，");
		}while(month<=0||month>12);
		print(year,month);
	}
	public static void print(int year,int month) {
		System.out.println("\t\t"+month+"月"+year+"年");
		System.out.println("=================================================");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int monthDays=getMonthDays(year,month);
		int firstDay=2+getFirstDay(year,month);
		if(firstDay>=7) {
			firstDay=firstDay-7;
		}
		for(int i=0;i<firstDay;i++) {
			System.out.print("\t");
		}
		for(int i=1;i<=monthDays;i++) {
			System.out.print(i+"\t");
			firstDay++;
			if(firstDay>=7) {
				System.out.println("\n");
				firstDay=0;
			}
		}
	}
	public static int isLeapYear(int year) {
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			return 1;
		}else {
			return 0;
		}
	}
	public static int getMonthDays(int year,int month) {
		switch(month) {
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
	public static int getFirstDay(int year,int month) {
		int sum=0;
		for(int i=1901;i<year;i++) {
			if(isLeapYear(i)==1)//这里是判断中间每一年的平闰
				sum+=366;
			else {
				sum+=365;
			}
		}
		for(int i=1;i<month;i++) {
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				sum+=31;break;
			case 2:
				if(isLeapYear(year)==1) {
					sum+=29;break;
				}else {
					sum+=28;break;
				}
			default:sum+=30;
			}
		}
		return sum%7;
	}

	
}
