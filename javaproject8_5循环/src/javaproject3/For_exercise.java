package javaproject3;
/**
 * 
 * @author zh
 *2021年8月5日 下午4:39:41
 *@description 一对兔子，出生后的第三个月起每月生一对兔子，兔子不死
 *输出3-12月的兔子总数,实际就是前俩数加起来等于第三位数
 */
public class For_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a,b,c;
		a=1;b=1;c=0;
		for(i=3;i<=12;i++)
		{
			c=a+b;
			int t=a;
			a=b;
			b=c;
			System.out.println("第"+i+"月："+c);
		}
	}

}
