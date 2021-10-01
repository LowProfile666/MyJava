package DailyPractice;

import java.util.Scanner;

/**
 * 练习题:求质数:接收用户输入的数字,判断是否为质数
质数的概念:一个大于1的自然数,除了1和它自身外,不能被其他自然数整除的数叫做质数,也称为素数
规定:1既不是质数,也不是合数
 * @author zh
 *2021年8月27日 下午7:23:57
 *@description
 */
public class 求质数8_27_3 {

	public static void main(String[] args) {
		System.out.println("请输入一个大于1的数：");
		int input=new Scanner(System.in).nextInt();//接受数字
		F(input);//调用求质数的方法
	}
public static void F(int intput) {
	
	 /* 自写方法*/
	 	if(intput==1) {
		System.out.println("1不是质数也不是合数！");
		return;//返回调用方法处
	 	}
	 	if(intput<1) {
	 		System.out.println("输入错误！退出程序！");
	 		return;//返回调用方法处
	 	}
	 	
	 	/**for(int i=2;i<=Math.sqrt(intput);i++)
	 	 *  如果一个数不是质数，那么必定是两个数的乘积，
	 	 * 而这两个数通常一个大一个小，并且小的小于等于根号n，大的大于等于根号n（数学定理），
	 	 * 所以一个数字在2~本身算术平方根这个数字区间内没有遇到能够被整除的数字，那么这个数就不是质数。
	 	 * 例如100=2*50=4*25=5*20=10*10 只需要找2—10这个区间即可。
	 	 */
	 	for(int i=2;i<intput;i++){//这是除了1和它本身的范围
	 		if(intput%i==0){
	 			//从2到它自身减1的依次进行求余，如能被整除说明它不是一个质数，方法返回到调用方法处
	 			System.out.println(intput+"是个合数！");
	 			return;//返回调用方法处
	 		}
	 	}
	 	//循环走完后，说明没有一个数能整除intput，所以他是个质数
	 	System.out.println(intput+"是个质数！");
		
	/**参考方法，借鉴CSDN博主：程序媛 泡泡
	if(intput<2) {//此范围内的数均不为质数
        System.out.println(intput+"不是质数");
        return;//结束程序
    }
    if(intput == 2) {
        System.out.println("2是质数");
        return;
    }
    //在 2到 1+n开方范围(数学理论)，找能把n整除的值(这个值也称作因子)
    //如果找到可以把n整除的第三个数，那n就不是质数,反之,n为质数
    double max = 1+ Math.sqrt(intput);//max保存的是查找因子的范围

    //依次遍历范围内的所有数,验证是否存在n的因子
    for(int i=2; i<max; i++) {
        //判断n能不能被i整除,如果有,说明不是质数
        if(intput%i == 0) {
            System.out.println(intput+"不是质数");
            return;
        }
    }
    //如果判断了范围内的所有值，没有能整除的,则说明n是质数
    System.out.println(intput+"是质数");*/

}
}
