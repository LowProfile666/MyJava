package javaproject2;

import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年8月4日 上午10:46:21
 *@description 
 */
public class scanner8_4 {
    public final static int Number = 3;
	public static void main(String[] args) {
		String name;
		double score1,score2,score3;
		double average;//平均分
		double total;//总分
		
		Scanner s = new Scanner (System.in);
		System.out.println("请输入姓名 成绩1 成绩2 成绩3：");
		
		name=s.next();
		score1=s.nextDouble();
		score2=s.nextDouble();
		score3=s.nextDouble();
		total=score1+score2+score3;
		average=total/Number;
		System.out.println(name+"的总分是"+total+"\n"+name+"的平均分是"+average);

	}

}
