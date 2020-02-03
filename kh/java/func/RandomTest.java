package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public void random1() {
		Random r = new Random();
		// r.nextInt(); 랜덤숫자 생성 -> 정수형 범위와 동일 (int)
		// -2^31 ~ 2^31-1
		int randomNum = r.nextInt();

		System.out.println(randomNum);

		// 0부터 10 개 숫자중 랜덤숫자 추출 0~9
		int randomNum1 = r.nextInt(10);

		System.out.println(randomNum1);

		// 0부터 31까지중의 랜덤숫자 추출

		int randomNum2 = r.nextInt(32);
		System.out.println(randomNum2);
	}

	public void random2() {

		Random r = new Random();

		int randomNum1 = r.nextInt(10); // 0~9

		System.out.println("0~9까지의 랜덤수:" + randomNum1);

		int randomNum2 = r.nextInt(2); // 0 or 1

		System.out.println("0 또는 1:" + randomNum2);

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
			System.out.println("===동전 앞뒤 맞추기====");
			System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
			int num = sc.nextInt();
			if (num == 1 || num == 2) {
				if (num == ranNum) {
					System.out.println("맞췄습니다 ^^");
				} else {
					System.out.println("땡! 틀렸습니다!");
				}
				System.out.println("한번더?[y/n]");
				char ch = sc.next().charAt(0);
				if(ch=='n') {
					break;
				}
			}
			else {
				System.out.println("다시입력하세요");
			}
		}

	}
	public void random4() {
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			System.out.println("=====가위 바위 보 게임=====");
			System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
			int num = sc.nextInt();
			int ranNum = r.nextInt(3)+1;
			
			System.out.println("=======결과======");
			
			if(num ==1) {
				System.out.println("당신은 가위를 냈습니다.");
			}else if(num==2) {
				System.out.println("당신은 바위를 냈습니다.");
			}else if(num==3) {
				System.out.println("당신은 보를 냈습니다.");
			}else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
			switch(ranNum) {
			case 1:
				System.out.println("컴퓨터는 가위를 냈습니다.");
				break;
			case 2:
				System.out.println("컴퓨터는 바위를 냈습니다.");
				break;
			default:
				System.out.println("컴퓨터는 보를 냈습니다.");
			}
			
			System.out.println("======================");
			
			if(num==ranNum) {
				System.out.println("비겼습니다");
			}else if((num==1&&ranNum==2)||(num==2&&ranNum==3)||
					(num==3&&ranNum==1)) {
				System.out.println("컴퓨터가 이겼습니다.");
			}else {
				System.out.println("당신이 이겼습니다.");
			}
			
			System.out.print("다시 하시겠습니까[y/n] ? ");
			char ch = sc.next().charAt(0);
			
			if(ch=='n') {
				break;
			}
		} 
		
		
	}
}
