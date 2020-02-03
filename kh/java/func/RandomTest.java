package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public void random1() {
		Random r = new Random();
		// r.nextInt(); �������� ���� -> ������ ������ ���� (int)
		// -2^31 ~ 2^31-1
		int randomNum = r.nextInt();

		System.out.println(randomNum);

		// 0���� 10 �� ������ �������� ���� 0~9
		int randomNum1 = r.nextInt(10);

		System.out.println(randomNum1);

		// 0���� 31�������� �������� ����

		int randomNum2 = r.nextInt(32);
		System.out.println(randomNum2);
	}

	public void random2() {

		Random r = new Random();

		int randomNum1 = r.nextInt(10); // 0~9

		System.out.println("0~9������ ������:" + randomNum1);

		int randomNum2 = r.nextInt(2); // 0 or 1

		System.out.println("0 �Ǵ� 1:" + randomNum2);

		int randomNum3 = r.nextInt(10) + 1; // 1~10

		System.out.println(randomNum3);

		int randomNum4 = r.nextInt(16) + 20; // 20~35

		System.out.println(randomNum4);
	}

	public void random3() {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		
		while (true) {
			int ranNum = r.nextInt(2) + 1;
			System.out.println("===���� �յ� ���߱�====");
			System.out.print("���ڸ� �Է����ּ��� (1.�ո� / 2.�޸�) : ");
			int num = sc.nextInt();
			if (num == 1 || num == 2) {
				if (num == ranNum) {
					System.out.println("������ϴ� ^^");
				} else {
					System.out.println("��! Ʋ�Ƚ��ϴ�!");
				}
				System.out.println("�ѹ���?[y/n]");
				char ch = sc.next().charAt(0);
				if(ch=='n') {
					break;
				}
			}
			else {
				System.out.println("�ٽ��Է��ϼ���");
			}
		}

	}
	public void random4() {
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			System.out.println("=====���� ���� �� ����=====");
			System.out.print("���ڸ� �����ϼ���(1.����/2.����/3.��) : ");
			int num = sc.nextInt();
			int ranNum = r.nextInt(3)+1;
			
			System.out.println("=======���======");
			
			if(num ==1) {
				System.out.println("����� ������ �½��ϴ�.");
			}else if(num==2) {
				System.out.println("����� ������ �½��ϴ�.");
			}else if(num==3) {
				System.out.println("����� ���� �½��ϴ�.");
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}
			
			switch(ranNum) {
			case 1:
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				break;
			case 2:
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				break;
			default:
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
			}
			
			System.out.println("======================");
			
			if(num==ranNum) {
				System.out.println("�����ϴ�");
			}else if((num==1&&ranNum==2)||(num==2&&ranNum==3)||
					(num==3&&ranNum==1)) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}else {
				System.out.println("����� �̰���ϴ�.");
			}
			
			System.out.print("�ٽ� �Ͻðڽ��ϱ�[y/n] ? ");
			char ch = sc.next().charAt(0);
			
			if(ch=='n') {
				break;
			}
		} 
		
		
	}
}
