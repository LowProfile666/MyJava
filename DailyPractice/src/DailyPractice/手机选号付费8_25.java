package DailyPractice;

import java.util.Scanner;

public class 手机选号付费8_25 {

	public static void main(String[] args) {
//		练习题: 手机选号:根据用户输入的手机号来确认用户实际支付的价格
//		如果尾数为8，需支付办卡费50元
//		如果尾数为4，需支付办卡费用0元
//		如果是其他尾号,需支付办卡费用20元
		
		String tel;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入您预选的电话号码：");
		do {
			tel=scanner.nextLine();
			//判断电话号是否正确
			if(tel.length()!=11) {
			System.out.println("电话格式错误！请重新输入：");
			}
		} while (tel.length()!=11);
		System.out.println("您预选的号码是："+tel+"，需支付办卡费用为："+getPrice(tel)+"元");
	}
	public static int getPrice(String tel) {
		//要获得电话的尾数
		int num=tel.charAt(10);
		switch(num) {
		case 8:return 50;
		case 4:return 0;
		default:return 20;
		}
	}
}
