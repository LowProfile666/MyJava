package javaproject2;

import java.util.Scanner;

public class Switch8_4 {

	public static void main(String[] args) {
		double input;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入成绩：");
		input=scanner.nextDouble();
		String grade = null;
		int a;
		if(input>=90) {
			a=1;
		}else if(input>=80) {
			a=2;
		}else if(input>=70) {
			a=3;
		}else if(input>=60) {
			a=4;
		}else {
			a=5;
		}
		switch(a)
		{
			case 1:grade="成绩优秀，戒骄戒躁，继续保持";break;
			case 2:grade="成绩良好，均衡发展，继续努力";break;
			case 3:grade="成绩及格，提高效率，争取考好";break;
			case 4:grade="成绩较差，抓紧时间，努力向前";break;
			case 5:grade="成绩西撇，没得救了，趁早滚蛋";break;
		}
		System.out.println(grade);
    
	}

}
