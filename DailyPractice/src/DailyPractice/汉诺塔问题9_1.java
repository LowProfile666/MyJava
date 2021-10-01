package DailyPractice;

 
import java.util.Scanner;
/**
 * 
 * @author zh
 *2021年9月1日 下午8:42:53
 *@description:
 *汉诺塔（Tower of Hanoi），又称河内塔，是一个源于印度古老传说的益智玩具。
 *大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。
 *大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。 
 */

public class 汉诺塔问题9_1 {
	static int m=0;//定义一个数用来记载次数
	public static void main(String[] args) {
		 int num;//盘子数
		char a,b,c;//三个圆柱名
		a='A';b='B';c='C';
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入盘子个数：");
		num=scanner.nextInt();
		
		hanoi(num,a,b,c);//调用Hanoi函数
		System.out.println("共移动了"+m+"次");
	}
	
	public static void hanoi(int num,char m,char n,char q) {
		//定义m,n,q用来表示三个柱子：
		//m表示第一根柱子：起始柱；n表示第二根柱子：中转柱；q表示第三根柱子：目标柱
		if(num==1)//只有一个盘子的时候
			count(num,m,q);//这个函数用来输出次数以及过程
		else {//不止一个盘子的时候
			//此时目标柱先作中转柱，中转柱作目标柱
			//先将num-1的盘子放在中转柱上，然后将第num个盘子放在目标住上
			hanoi(num-1, m, q, n);
			count(num,m,q);
			//此时目标柱上就一个第num个盘子，中转柱上有num-1个盘子，起始柱上空，所以将起始柱变为中转，原来的中转柱就变为起始：
			//将新起始柱上的num-1-1个盘子放在新中转柱上，然后将第num-1个盘子放在目标住上
			hanoi(num-1, n, m, q);
		}
	}
	public static int count(int n,char x,char y) {
		m++;
		System.out.println("第"+m+"次移动的过程为："+x+"-->"+y);
		return m;
	}

}
