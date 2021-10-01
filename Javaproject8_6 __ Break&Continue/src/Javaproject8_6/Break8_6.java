package Javaproject8_6;
/**
 * 
 * @author zh
 *2021年8月6日 上午11:02:47
 *@description 输出1-100之间数的平方小于1000的偶数
 */
public class Break8_6 {

	public static void main(String[] args) {
		for(int i=2;i<=100;i+=2) {
			if(i*i<1000)
				System.out.print(" "+i);
			else 
				break;
		}
	}

}
