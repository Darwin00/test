package chenken;

import java.util.Scanner;	

public class XSGLXT {	

	public static void main(String[] args) {																					
		Scanner in = new Scanner(System.in);
		System.out.println("������ѧ��������");
		int renshu = in.nextInt(); // ���������ѧ��������
		System.out.println("������γ̵���Ŀ");
		int courseNum = in.nextInt();
		int[][] courseGrade = new int[renshu][courseNum];
		String[] name = new String[renshu]; // ����һ��String���飬�������ѧ��������
		String[] course = new String[courseNum];// ����һ��String����������ſγ̵�����
		/**
		 * ���������γ̵�����
		 */
		for (int i = 0; i < course.length; i++) {
			System.out.println("�������" + (i + 1) + "�ſγ̵�����");
			course[i] = in.next();
		}

		for (int i = 0; i < renshu; i++) {
			System.out.println("������ѧ��������");
			name[i] = in.next();
			for (int j = 0; j < courseNum; j++) {
				System.out.println("������" + name[i] + "��" + course[j] + "�ɼ�");
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
