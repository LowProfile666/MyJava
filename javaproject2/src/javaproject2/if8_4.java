package javaproject2;
import java.util.Scanner;
public class if8_4 {
	public static void main(String[] args) {
		/*Scanner scanner=new Scanner(System.in);
		double score;
		char grade;
		System.out.println("请输入成绩查看相应等级：");
		score=scanner.nextDouble();
		if(score>=90) {
			grade='A';
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else if(score>=60) {
			grade='D';
		}else {
			grade='E';
		}
		System.out.println("您的等级是"+grade);
	}*/
		double score;
		char grade;
		System.out.println("请输入你的成绩：");
		Scanner scanner=new Scanner(System.in);
		score=scanner.nextDouble();
		if(score>=0&&score<=100) {
			if(score>=60) {
			grade='D';
			if(score>=90) {
				grade='A';
			}else if(score>=80) {
				grade='B';
			}else if(score>=70) {
				grade='C';
			}
		    }else {
			grade='E';
		    }
			System.out.println("你的等级是"+grade);
	}else {
		System.out.println("输入错误");
	}
}
}