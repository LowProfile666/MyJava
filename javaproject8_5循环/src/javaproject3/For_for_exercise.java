package javaproject3;
/**
 * 
 * @author zh
 *2021年8月5日 下午4:55:47
 *@description 循环的嵌套之打印九九乘法表
 */
public class For_for_exercise {

	public static void main(String[] args) {
	/**	// TODO Auto-generated method stub
		/*int i=0;
		for(i=1;i<=9;i++)
		{
			int j=0;
			for(j=1;j<=i;j++) 
			{
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.print("\n");
		
		//打印标题
		System.out.println("\t\t\t\t九九乘法表");
		//打印表头
		System.out.print("\t");
		for(int i=1;i<=9;i++) {
		System.out.print("  "+i+"\t"); 
		}
		System.out.print("\n");
		for(int i=0;i<=9;i++) {
			System.out.print("--------");//分割线
		}
		System.out.println("\n");
		for(int i=1;i<=9;i++) {
				System.out.print(i+" |\t");//打印每行列头
			for(int j=1;j<=i;j++) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println("\n");*/
		//打印一个标题
		System.out.println("\t\t\t\t九九乘法表");

		//打印表头
		for(int i=1;i<=9;i++){
		    System.out.print("\t  "+i);
		}
		System.out.print("\n");

		//打印分割线
		for(int i=0;i<9;i++){
		    System.out.print("---------"); //一个\t为8个空格
		}
		System.out.print("\n");


		for(int i=1;i<=9;i++){
		    //打印每行列头
		    
		        System.out.print(i+"|"+"\t");
		  
		    for(int j=1;j<=i;j++){
		        System.out.printf("%d*%d=%d\t",j,i,i*j); //这里用格式化输出方便一点
		    }
		    System.out.print("\n");
		}
		}

	}


