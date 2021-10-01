package DailyPractice;
import java.util.Scanner;
/**
 * @author zh
 *2021年8月26日 上午11:52:11
 c
 */
public class 商品录入系统8_26_1 {
	//成员变量
	static String[] name= new String[] {"未输入","未输入","未输入","未输入","未输入"};//商品名称
	static int[] price= new int[] {0,0,0,0,0};//商品价格
	static int[] number= new int[]{0,0,0,0,0};//商品数量
	static int count=0;
	//count用来记录入了多少次；在第一次没录完第二次接着录的情况下也可以做数组下标，不然数组又会从第一个元素开始录
	
public static void main(String[] args) {
	outer:while(true) {//设置死循环用来每一次进行完操作后自动显示菜单
		int c=menu();
		//new Scanner(System.in).nextInt();//从菜单界面返回一个值来进行选择操作
		switch(c) {
		case 1:show();break;//显示商品信息
		case 2:add();break;//添加商品信息并显示结果
		case 3:reach();break;//搜索商品并显示商品信息
		case 4:f4();break;//统计商品信息并显示
		case 5://退出程序
			System.out.println("成功退出！");
			break outer; //用return也能这样
		//outer 标签，break outer可以退出当前全部循环
		default:System.out.println("选择错误！");
		}
	}
}
//菜单显示
public static int menu() {
	System.out.println("===========");
	System.out.println("1.显示商品信息");
	System.out.println("2.录入商品信息");
	System.out.println("3.搜索商品信息");
	System.out.println("4.统计商品信息");
	System.out.println("5.退出程序");
	if(count==0) {//count=0代表第一次或者还没有录入信息时，显示这个tips，录入过一次信息后就不再显示这条tips
	System.out.println("Tips:请先完成录入操作再选择后续操作...");
	}
	System.out.println("===========");
	System.out.print("请选择：");//提醒用户选择操作
	return new Scanner(System.in).nextInt();//直接返回用户选择的结果
}
//展示商品信息
public static void show() {
	if(count==0) {//count=0代表第一次或者还没有录入信息时
		System.out.println("当前还没有商品，请先完成录入操作在选择该操作哦！^0^\n");
	}else {//代表已经录入过信息了
		System.out.println("名称\t\t价格\t\t库存");
		for (int i = 0; i < name.length; i++) {//循环遍历数组，显示所有商品信息
			System.out.print(name[i]+"\t\t");
			System.out.print(price[i]+"元"+"\t\t");
			System.out.print(number[i]+"个"+"\t\t");
			System.out.println();//与下个菜单界面隔两行
		}
	}
}
//录入商品信息
public static void add() {
	outer:for (int i= 0; i < name.length; i++) {
		//遍历数组赋值
			System.out.print("请输入要添加的第"+(count+1)+"件商品的名称：");
			name[count]=new Scanner(System.in).nextLine();//string类一般用next.Line();赋值
			System.out.print("请输入要添加的第"+(count+1)+"件商品的价格：");
			price[count]=new Scanner(System.in).nextInt();
			System.out.print("请输入要添加的第"+(count+1)+"件商品的数量：");
			number[count]=new Scanner(System.in).nextInt();
			System.out.println("录入成功！");
			count++;
			if(count!=name.length) {//表示还没有录入到最多个商品信息
				System.out.println("是否继续录入？（t退出,j继续）:");
				String input=new Scanner(System.in).nextLine();
			if(input.equals("t")) {
				show();//显示刚刚录入的结果
				break outer;//跳到菜单界面，退出这个循环
			}else if(!(input.equals("j"))){
				//String不能直接比较，必须用equals比较，这里代表输入结果不是t也不是j的情况
				System.out.println("选择错误！");
				break;
					}
			}
		else { //这代表count=5，已经录入到了最多个的时候
			System.out.println("已全部录入！");
			show();//展示录入后的信息
			break outer;//退出这个循环，回到菜单界面
		}
	}
}
//搜索商品信息
public static void reach(){
	if(count==0) {//count=0代表第一次或者还没有录入信息时
		System.out.println("当前还没有商品，请先完成录入操作在选择该操作哦！^0^\n");
		return;//直接返回调用此方法界面，也就是菜单界面
	}
	System.out.println("请输入要查询的商品名称：");
	String input=new Scanner(System.in).nextLine();
	for (int i = 0; i < name.length; i++) {//需要在所有商品中查找，所以要遍历整个数组
		if(input.equals(name[i])) {//找到与输入值相等的元素
			System.out.println("名称："+name[i]+"，价格："+price[i]+"元"+"，库存："+number[i]+"个");
			break;
		}else if(i==name.length-1){//没有找到与之相等的元素
			System.out.println("找不到该商品！");
		}
	}
}
//统计商品信息
public static void f4() {
	if(count==0) {//count=0代表第一次或者还没有录入信息时
		System.out.println("当前还没有商品，请先完成录入操作在选择该操作哦！^0^\n");
		return;//直接返回调用此方法界面，也就是菜单界面
	}
	System.out.println("名称\t单价\t库存\t总价");
	for (int i = 0; i < name.length; i++) {//显示所有商品信息
		System.out.println(name[i]+"\t"+price[i]+"元/个"+"\t"+number[i]+"个"+"\t"+(price[i]*number[i]));
	}
}
}
