package javaproject8_14;

import javax.print.attribute.standard.Sides;

/**
 * 
 * @author zh
 *2021年8月14日 上午11:07:16
 *@description  
 *字符串的比较
 */
public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s0="java";
		//String s6="program";
		String s1=s0+" program";
		String s2="java Program";
		String s3="java program";
		String s4="java program";
		String s5=new String("java program");
		
		//==用于比较两个变量是否引用同一个对象
		
		System.out.println(s1);
		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("s0==s1 "+(s0==s1));
		System.out.println("s2==s3 "+(s2==s3));
		System.out.println("s3==s4 "+(s3==s4));
		System.out.println("s4==s5 "+(s4==s5));
		//s1.intern()返回其限定字符串，s2限定字符串
		System.out.println("s1.intern()==s3 is "+(s1.intern()==s3));
		
		//equals比较两个字符串的内容是否相同
		System.out.println("s1.equals(s3) is "+(s1.equals(s3)));
		System.out.println("s1.equals(s2) is "+(s1.equals(s2)));
		//equalsIgnoreCase忽略大小写
		System.out.println("s2.equals(s3) is "+(s2.equals(s3)));
		System.out.println("s2.equalsIgnoreCase(s3) is "+(s2.equalsIgnoreCase(s3)));
		
		//regoinMatches比较部分字符串
		System.out.println("s2.regionMatches(5,s0,0,6) is "+(s2.regionMatches(5,s0,0,6)));
		//第一个参数表示从s2的第五个字符开始比较，第二个参数表示要对比的另一个字符串，
		//第三个参数表示从s0的第0个字符开始比较，第四个参数表示比较的长度为6
		System.out.println("s2.regionMatches(5,s3,5,6) is "+(s2.regionMatches(5,s3,5,6)));
		System.out.println("s2.regionMatches(true，5,s3,5,6) is "+(s2.regionMatches(true,5,s3,5,6)));
		//第一个参数true表示忽略大小写
		
		//startsWith 判断是否以某个字符串开始
		//endsWith 判断是否以某个字符串结束
		System.out.println("s2.startsWith(s0) is "+s2.startsWith(s0));
		System.out.println("s2.endsWith(s0) is "+s2.endsWith(s0));
		
		//compare To 根据字典排序比较两个字符串
		String s6="abc";
		String s7="abe";
		String s8="abcefg";								
		System.out.println("s6.compareTo(s7) is "+s6.compareTo(s7));
		System.out.println("s6.compareTo(s8) is "+s6.compareTo(s8));
	}

}
