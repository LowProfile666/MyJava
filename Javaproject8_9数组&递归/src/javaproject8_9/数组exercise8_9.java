package javaproject8_9;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author zh
 *2021年8月9日 下午4:57:26
 *@description 
 *计算成绩的输入次数，以-1结束，不超过100个，
 *按成绩高低输出成绩及出现次数
 *半成品——8.25
 */
public class 数组exercise8_9 {

	public static void main(String[] args) {
	 int[] scoreArray=new int[101];
	 int i=0;
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("请输入学生成绩，以-1结束：");
	 do {
		scoreArray[i]=scanner.nextInt();
		i++;
	} while (scoreArray[i-1]!=-1);//当输入了-1后i++；所以要跳出循环就得i-1，就是值为-1的下标
	 
	 int[] newArray=new int[i-1];//因为输入了一个-1，所以我们需要的数组实际大小应为i-1
	 for(int j=0;j<i-1;j++) {
		 newArray[j]=scoreArray[j];
	 }
	 //System.out.println("赋值后的新数组："+Arrays.toString(newArray));
	 
	 int[] countArray=new int[i-1];//出现次数
	 for(i=0;i<countArray.length;i++) {
		 countArray[i]=1;
	 }
	 //System.out.println(Arrays.toString(countArray));
	 //冒泡排序
	 int flag=1;
	 for(i=0;i<newArray.length-1;i++) {//总趟数
		 for(int j=0;j<newArray.length-1-i;j++) {
			 //每一个数都只需要从后面的那一个数比较起，如果前面有数也不需要去比较，所以是newArray.length-i
			 if(newArray[j]>newArray[j+1]) {
				 int tmp=newArray[j];
				 int tmp2=countArray[j];
				 newArray[j]=newArray[j+1];
				 countArray[j]=countArray[j+1];
				 newArray[j+1]=tmp;
				 countArray[j+1]=tmp2;		
				 flag=0;
			 }
			 if(newArray[j]==newArray[j+1]) {  
				 countArray[j]++; 
			 }
		 }
		 if(flag==1)
			 break;
	 }
	 //System.out.println(Arrays.toString(countArray));
	//System.out.println("排序后的新数组："+Arrays.toString(newArray));
	 
	for(i=0;i<newArray.length;i++) { 
		 System.out.println("成绩："+newArray[i]+"，出现次数："+countArray[i]);
		 
		 if(i==newArray.length-1) //消除警告
			 break;
		 if(newArray[i]==newArray[i+1]) 
			 i++;
	 }
	}
}


