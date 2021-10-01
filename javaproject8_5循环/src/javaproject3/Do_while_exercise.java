package javaproject3;
import java.util.Scanner;

import java.lang.String;
/**
 * 
 * @author zh
 *2021年8月5日 下午4:17:25
 *@description 用do while编写程序：输入自定人数、名字、成绩，输出最高成绩的名字
 *未完成，留待将来……
 *2021.8.21 完成，当有多个最高分输出名字尚未完成
 */
public class Do_while_exercise {
	public static void main(String[] args) {
		int number;
		double score;
		String name;
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入学生个数：");
		number=scanner.nextInt();	
		int i=0;
		String[] Name=new String[number];
		double[] Score=new double[number];
		if(number>0) {
		do {
			System.out.println("输入第"+(i+1)+"个学生的名字：");
			name=scanner.next();
			Name[i]=name;
			System.out.println("输入第"+(i+1)+"个学生的成绩：");
			score=scanner.nextDouble();
			Score[i]=score;
			i++;
		    }while(i<number);
		}else {
			System.out.println("你他妈输入错误，滚！");
		}
		for(int j=0;j<number-1;j++) {
			if(Score[j]>Score[j+1]) {
			double tmp=Score[j+1];
			String tmp2=Name[j+1];
			Score[j+1]=Score[j];
			Name[j+1]=Name[j];
			Score[j]=tmp;
			Name[j]=tmp2;
		}
	}
		
		
		System.out.println("最高分是："+Score[Score.length-1]+"，他是："+Name[Name.length-1]);
	}
}



