package Javaproject8_6;

import java.util.Scanner;



/**
 * 
 * @author zh
 *2021年8月6日 上午11:19:26
 *@description 输入成绩，统计分数大于等于80的人数，
 *当输入的成绩为-1 时程序结束录入；输出学生总人数及成绩>=80的人数
 */
public class Continue8_6 {

	public static void main(String[] args) {
		double score;
		int number;//总人数
		int count;//>80人数
		Scanner scanner=new Scanner(System.in);
		number=0;
		count=0;
		System.out.println("请输入成绩，以-1结束：");
		do {
			score=scanner.nextDouble();
			number++;//总人数计算
			if(score<80)
				continue;
			count++;//大于等于80人数计算
		}while(score!=-1);
		number--;//减去-1占的人数
		System.out.println("学生总人数："+number+"\n成绩大于等于80的人数："+count);
	}
}
