package DailyPractice;

import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年9月10日 下午2:05:45
 *@description:杨辉三角，是二项式系数在三角形中的一种几何排列，中国南宋数学家杨辉1261年所著的《详解九章算法》一书中出现。
 *在欧洲，帕斯卡（1623----1662）在1654年发现这一规律，所以这个表又叫做帕斯卡三角形。帕斯卡的发现比杨辉要迟393年，比贾宪迟600年。
杨辉三角是中国数学史上的一个伟大成就。
 */
public class 杨辉三角9_10 {

	/**
	 * 思路：
	 * 先定义一个二维数组用来存储杨辉三角的每一个数，然后再按格式给他输出
	 * 先给二维数组赋值，观察到杨辉三角的每一行的第一个值和最后一个值都等于1，
	 * 还有从第三行开始，除了首位位置的元素外等于1外，其他元素都等于其上一行的该位置前后两个数之和
	 * 然后输出，我们按等腰三角形的格式输出
	 * 每一行的第一个元素前面都有空格，可以用循环来打印每一行的 空格 ，每行空格数量等于总行数-该行数
	 * 然后输出完一行后要换行
	 * 
	 *2021年9月10日 下午3:01:07
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[][] Y;//声明二维数组
		int n;//行数，也等于列数
		System.out.println("请输入你要打印多少行：");
		n=scanner.nextInt();
		Y=new int[n][n];//创建二维数组
		
		//先给他赋值
		for(int i=0;i<Y.length;i++) {//这里的循环次数就是行数
			Y[i][0]=1;//每一行的首元素
			if(i>0) {//从第二行开始
				for(int j=1;j<=i;j++) {//排除首元素，所以j从1开始一直到最后一个元素
					Y[i][j]=Y[i-1][j]+Y[i-1][j-1];//每一个元素等于上面两个元素之和
				}
			}
		}
		//再打印输出
		for(int i=0;i<Y.length;i++) {//外循环次数就是输出行数，一行一行的输出
			for(int j=0;j<Y.length-i;j++) {//这是打印一排首元素前的空格
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {//内循环的次数就是每一行的列数就是元素个数
				System.out.printf("%3d ",Y[i][j]);
			}
			System.out.println();//这是每一行打印完换行
		}
		
	}

}
