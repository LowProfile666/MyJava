package DailyPractice;
/**
 * 练习题:求猴子大王
15个猴子围成一圈选大王,依次1-7循环报数,报到7的猴子被淘汰,直到最后一只猴子称为大王,问:哪只猴子会成为大王?
 * @author zh
 *2021年8月31日 下午7:34:32
 *@description
 */
public class 求猴子大王8_31_2 {

	public static void main(String[] args) {
		int size=6;
		int left=size;
		int num=2;
		int[] monkey=new int[size];
		
		for(int i=0;i<monkey.length;i++) {
			monkey[i]=1;
		}
		
		int i=0;
		int count=0;
		while(left>1) {
			if(monkey[i]==1) {
				count++;
			}
			if(count==num) {
				monkey[i]=0;
				left--;
				count=0;
			}
			i++;
			if(i==monkey.length-1) {
				if(count==num) {
					monkey[i]=0;
					left--;
					count=0;
				}
				if(monkey[i]==1) {
					count++;
					i=0;
					continue;
				}
				i=0;
			}
		}
		System.out.println("猴子大王是："+(i+1));
	}
}
