package javaproject3;

import java.util.Scanner;

public class While8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score;
		double total=0;
		int i=0;
		System.out.println("请输入十个学生的成绩：");
		while(i<10) {
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			score=scanner.nextDouble();
			total+=score;
			i++;
		}
		double average;
		average=total/10;
		System.out.println("他们的平均成绩是："+average);

	}
	}


