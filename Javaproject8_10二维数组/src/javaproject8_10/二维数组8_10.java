package javaproject8_10;
/***
 * 
 * @author zh
 *2021年8月10日 下午5:14:15
 *@description
 *5道题，共十分，答案dbdcc，
 *1：abacc
 *2：dbabc
 *3：eddac
 *4：cbaed
 *5：abdcc
 */
public class 二维数组8_10 {

	public static void main(String[] args) {
	//1.首先是如何将学生作答数据、试卷答案与学生成绩的数据在计算机中存储表示
		char[][] studentAnswer= {
				{'a','b','a','c','c'},
				{'d','b','a','b','c'},
				{'e','d','d','a','c'},
				{'c','b','a','e','d'},
				{'a','b','d','c','c'}
		};
		char[] standarAnswer= {'d','b','d','c','c'};
		int[] studentScores=new int[studentAnswer.length];
	//2.计算分数：将每个学生的答案与标准答案比对，对的加两分
		for(int i=0;i<studentAnswer.length;i++) {
			//计算学生(i+1)的成绩
			for(int j=0;j<studentAnswer[i].length;j++) {
				if(studentAnswer[i][j]==standarAnswer[j]) {
					studentScores[i]+=2;
				}
			}
		}
		
		
	//3.输出成绩
		for(int i=0;i<studentScores.length;i++) {
			System.out.println("学生"+(i+1)+"的分数是"+studentScores[i]);
		}
	}

}
