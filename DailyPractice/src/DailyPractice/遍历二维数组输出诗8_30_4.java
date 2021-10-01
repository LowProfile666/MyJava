package DailyPractice;

import java.util.Scanner;

/**
 * 练习题：遍历二维数组打油诗
 * @author zh
 *2021年8月30日 下午2:22:14
 *@description
 */
public class 遍历二维数组输出诗8_30_4 {

	public static void main(String[] args) {
//		String[][] arr= {
//				{"云","想","衣","裳","花","想","容，"},//0
//				{"春","风","拂","槛","露","华","浓。"},//1
//				{"若","非","群","玉","山","头","见，"},//2
//				{"会","向","瑶","台","月","下","逢。"} //3
//				//0    1   2	3	4
//		};
//		int count=0;//用来计换行的位置
//		/**
//		 * arr.length//表示有多少行，二维数组的元素是一维数组，它的长度可以理解为有多少个一维数组
//		 * arr[0].length//表示有多少列，一维数组里有多少个元素
//		 */
//		System.out.println("方法3：");
//		System.out.println(" 《清平调》");
//		System.out.println("\t李白");
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//				System.out.print(arr[i][j]);
//				count++;
//				if(count==arr[0].length) {
//					System.out.println();
//					count=0;
//				}
//			}
//		}
//		System.out.println("方法2：");
//		System.out.print("请输入古诗名字：");
//		String name=new Scanner(System.in).nextLine();
//		System.out.print("请输入作者：");
//		String author=new Scanner(System.in).nextLine();
//		System.out.print("该古诗有几行：");
//		int p=new Scanner(System.in).nextInt();//定义行数
//		String[] arr1=new String[p];//创建一维数组，将一句诗句当成一个元素
//		for(int i=0;i<p;i++) {//循环遍历数组
//			System.out.print("请输入第"+(i+1)+"行的诗句：");
//			arr1[i]=new Scanner(System.in).nextLine();//输入诗句
//		}
//		System.out.println("  "+name);//输出故事名
//		System.out.println("\t"+author);//输出诗人
//		for(int i=0;i<p;i++) {//打印输出每一个元素，就是每一行诗句
//			System.out.println(arr1[i]);
//		}
//		
//		
		System.out.println("方法1：");
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入古诗名：");
		String name=scanner.nextLine();
		System.out.print("请输入作者：");
		String author=scanner.nextLine();
		System.out.print("请输入你的古诗的行数与列数,以空格隔开：");
		int row=scanner.nextInt();//排数-row排
		int col=scanner.nextInt();//列数-column纵队，列
		
		//输入
		//先定义一个二维数组来存储诗句每个字
		String[][] arr3=new String[row][col];
		for(int i=0;i<arr3.length;i++) { //arr3.length可以换成row
			System.out.print("请输入第"+(i+1)+"排古诗，以空格分隔，回车结束：");
			for(int j=0;j<arr3[0].length;j++) { //arr3[0].length可以换成col
				arr3[i][j]=scanner.next(); 
				//这里不用nextLine，因为nextLine是读取一排的数据，只以enter结束，用nextLine的话输入的时候一排只能输入一个字才行
				//而next是读取下一个，忽略有效数值前的无效字符，默认情况下取出空格前的数据，
			}
		}
		//
		//输出
		//再顶一个计数器，用来计换行的位置，每打印一个字就加一，当一排全打印完后count就应该等于列数，此时换行且count清零
		int count=0;
		System.out.println("  "+name);//输出故事名
		System.out.println("\t"+author);//输出诗人
		for(int i=0;i<arr3.length;i++) { //外循环代表行
			for(int j=0;j<arr3[0].length;j++) {//内循环代表列
				System.out.print(arr3[i][j]);
				count++;
				if(count==col) {
					System.out.println();
					count=0;
				}
			}
//			   《清平调》
//     				李白
//			云 想 衣 裳 花 想 容，
//			春 风 拂 槛 露 华 浓。
//			若 非 群 玉 山 头 见，
//			会 向 瑶 台 月 下 逢。
		}
	}
}
