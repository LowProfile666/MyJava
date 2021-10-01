package DailyPractice;
/**
 * 练习题:求1000以内的完数
完数:如果一个数等于其所有因子之和,我们就称这个数为"完数",比如6的因子为1,2,3 6 = 1 + 2 + 3,那么6就是一个完数
 * @author zh
 *2021年8月30日 下午1:02:03
 *@description
 */
public class 求1000内的完数8_30_2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=1000;i++) {//1000内的每个数
			int sum=0;//定义一个数用来存和
			for(int j=1;j<i;j++) {//求i的因子
				if(i%j==0)//能整除说明是它的因子
					sum+=j;//是因子就累加起来
			}
			if(sum==i)//如果因子之和等于这个数，那他就是完数
				System.out.println(i+"是完数");
		}
	}

}
