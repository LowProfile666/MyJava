package DailyPractice;

import java.util.Scanner;
import java.lang.String;

public class 大小写转换9_5 {

	public static void main(String[] args) {
		System.out.println("请输入任意字符串：");
		String ch;
		Scanner scanner=new Scanner(System.in);
		ch=scanner.nextLine();
		for(int i=0;i<ch.length();i++) {
			char c=ch.charAt(i);
			if(c>='A'&&c<='Z') {
				c+=32;
			}else if(c>='a'&&c<='z'){
				c-=32;
			}
			System.out.print(c);
		}
		/**
		 * ToCharArray( )的用法，将字符串对象中的字符转换为一个字符数组。

			详解释就是：

			字符串转换成字符数组后，每个字符的ASC码与字符T的ASC码进行二进制异或运算。

			最后把结果转换回字符。
		 */
		/**
		 * foreach循环也叫增强型for循环,是for循环的一个简化版
			格式:
			for(循环对象的类型 元素名: 对象名 ){
			语句
			}	
		 */
//		for(char c:ch.toCharArray()) {
//			if(c>='A'&&c<='Z') {
//				c+=32;
//			}else if(c>='a'&&c<='z'){
//				c-=32;
//			}
//			System.out.print(c);
//		}
		
	}
}
