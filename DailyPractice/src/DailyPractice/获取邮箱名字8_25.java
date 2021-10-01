package DailyPractice;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterName;

public class 获取邮箱名字8_25 {
/**
 * 
 *练习题: 获取邮箱名字
 *接收用户输入的邮箱名，获取邮箱的名字
 *比如：cxy@163.com,输出cxy
 */
 /*
	 * "sdfwerw@rewerwe.com"
	 *         |
	 *         index
	 *
	 * 1. 定位 "@" 的下标位置 index
	 * 2. 截取 [0, index)，直接返回
	 * email.indexOf("@")// 查找指定子串的位置,找不到，得到特殊值 -1
	 * email.substring(0, index)// 截取 [0, index)
 */
	public static void main(String[] args) {
		String email;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入邮箱：");
		email=scanner.nextLine();
		System.out.println(printName(email));
	}
	
	public static String printName(String eamil) {
		int index=eamil.indexOf("@");//定位@的下标位置
		if(index==-1)//找不到
			return "邮箱格式错误";
		return eamil.substring(0,index);//截取【0，index)
		
		
	}
}
