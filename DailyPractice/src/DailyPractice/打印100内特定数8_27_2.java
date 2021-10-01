package DailyPractice;
/**
 * 练习题:打印100以内除了尾数为3,5,7的所有数
 * @author zh
 *2021年8月27日 下午7:15:43
 *@description
 */
public class 打印100内特定数8_27_2 {

	public static void main(String[] args) {
		boolean a=true;
		int i=0;
		while(a) {
			int g=i%10;
			if(g!=3&&g!=5&&g!=7) {
				System.out.print(i+" ");
			}
			i++;
			if(i==100)
				a=false;
		}
	}

}
