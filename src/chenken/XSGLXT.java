package chenken;

import java.util.Scanner;	

public class XSGLXT {	

	public static void main(String[] args) {																					
		Scanner in = new Scanner(System.in);
		System.out.println("请输入学生的人数");
		int renshu = in.nextInt(); // 接受输入的学生的人数
		System.out.println("请输入课程的数目");
		int courseNum = in.nextInt();
		int[][] courseGrade = new int[renshu][courseNum];
		String[] name = new String[renshu]; // 定义一个String数组，用来存放学生的姓名
		String[] course = new String[courseNum];// 定义一个String数组用来存放课程的名称
		/**
		 * 用来存贮课程的名称
		 */
		for (int i = 0; i < course.length; i++) {
			System.out.println("请输入第" + (i + 1) + "门课程的名字");
			course[i] = in.next();
		}

		for (int i = 0; i < renshu; i++) {
			System.out.println("请输入学生的姓名");
			name[i] = in.next();
			for (int j = 0; j < courseNum; j++) {
				System.out.println("请输入" + name[i] + "的" + course[j] + "成绩");
				courseGrade[i][j] = in.nextInt();
			}
		}
		System.out.println("name        kecheng        chengji");
		for (int i = 0; i < name.length; i++)
			for (int j = 0; j < courseNum; j++) {
				System.out.printf("%-12s%-12s%-12d\n", name[i], course[j], courseGrade[i][j]);
			}
		System.out.print("name   ");
		for (int i = 0; i < courseNum; i++)
			System.out.print("\t\t" + course[i]);
		System.out.println("");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
			for (int j = 0; j < courseNum; j++)
				System.out.print("\t\t" + courseGrade[i][j]);
			System.out.println("");
		}

	}

}
