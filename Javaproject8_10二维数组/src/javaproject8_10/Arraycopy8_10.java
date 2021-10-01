package javaproject8_10;


public class Arraycopy8_10 {

	public static void main(String[] args) {
		double[] arr= {10,20,40,30,50,60,70,80};
		double[] newarr=new double[12];
		for(int i=0;i<arr.length;i++) {
			newarr[i]=arr[i+1];
			System.out.println(newarr[i]);
		}
		

	}

}
