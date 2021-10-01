package javaproject8_11;
import java.util.Scanner;
import java.util.function.DoublePredicate;
/**
 * 
 * @author zh
 *2021年8月12日 下午1:50:58
 *@description
 *计算总分，第一维表示学生，第二维试卷，第三维每个题目的成绩
 */
public class 多维数组8_11 {
	public static void main(String[] args) {
		//定义变量
		double[][][] studentQuestionScores;//学生试卷题目的成绩
		double[] studentTotalScores;//学生总分
		//1.录入学生上试卷题目成绩
		studentQuestionScores=inputStudentQuestionScores();
		//2.计算学生总分
		studentTotalScores=computeTotal(studentQuestionScores);
		//3.输出学生总分
		printStudentTotalScores(studentTotalScores);
	}
/**
 * 录入学生成绩
 *2021年8月12日 下午1:55:56
 * @return 
 */
	public static double[][][] inputStudentQuestionScores(){
		double[][][] result;
		//1.1获取学生数、试卷数、每份试卷题目数，假定题目数相等
		int studentNumber;//学生数
		int testPaperNumber;//试卷数
		int questionNumberPerTestPaper;//题目数
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入（学生数 试卷数 题目数）：");
		studentNumber=scanner.nextInt();
		testPaperNumber=scanner.nextInt();
		questionNumberPerTestPaper=scanner.nextInt();
		
		//1.2录入学生试卷试题的成绩，为result赋值
		//1.2.1循环前初始化
		result=new double[studentNumber][testPaperNumber][questionNumberPerTestPaper];
		for (int i = 0; i < result.length; i++) {
			//处理第i个学生
			System.out.println("请输入第"+(i+1)+"个学生的成绩：");
			for (int j = 0; j < result[i].length; j++) {
				//处理第i个学生的第j份试卷
				System.out.println("\t请输入第"+(i+1)+"个学生的第"+(j+1)+"份试卷"+result[i][j].length+"道题目成绩");
				for (int k = 0; k < result[i][j].length; k++) {
					//处理第i个学生的第j份试卷的第k道题
					result[i][j][k]=scanner.nextDouble();
				}
			}
		}
		return result;
	}
	public static double[] computeTotal(double[][][] studentQuestionScores) {
		double[] result;
		//循环前初始话
		result=new double[studentQuestionScores.length];
		//循环累加
		for(int i=0;i<studentQuestionScores.length;i++) {
			//计算第i个学生的总分
			for (int j = 0; j < studentQuestionScores[i].length; j++) {
				//处理第i个学生第j分试卷
				for (int k = 0; k < studentQuestionScores[i][j].length; k++) {
					result[i]+=studentQuestionScores[i][j][k];
				}
			}
		}
		return result;
	}
	public static void printStudentTotalScores(double[] studentTotalScores) {
		for (int i = 0; i < studentTotalScores.length; i++) {
			System.out.println("学生"+(i+1)+"的总成绩是"+studentTotalScores[i]);
		}
	}
}
