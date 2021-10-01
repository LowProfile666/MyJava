package DailyPractice;
/**
 * 100元怎么买100个蛋，
 * 鸡蛋1毛一个，鸭蛋三元一个，鹅蛋六元一个
 * @author zh
 *2021年8月31日 下午7:15:39
 *@description
 */
public class 一百块买怎么买100个蛋8_31 {

	public static void main(String[] args) {
		int j=0,y=0,e=0;//定义鸡鸭鹅蛋数量
		for(int i=1;i<=100;i++) {
			j=i;
			for(int n=1;n<=100-i;n++) {
				y=n;
				e=100-j-y;
				if(j*0.1+y*3+e*6==100) {
					System.out.println(j+"个鸡蛋，"+y+"个鸭蛋，"+e+"个鹅蛋");
					break;
				}
			}
		}
	}

}
