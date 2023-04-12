package Review_Ch04;

import java.util.Scanner;// 스캐너 패키지 임포트

public class Swithch01 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		switch (num / 10) { // switch 값으로 num을 10으로 나눈 몫을 받음
		
		case 10 : // case 10 일때는 출력값이 없으므로 case9 로 순차적으로 이동
		case 9 : // 나눈값이 9, 즉, 90점부터는
			System.out.println("A 학점");// A 학점
			break;//A학점을 출력후 반복문 이탈
		case 8 :// 80점이상일때
			System.out.println("B 학점");// B 학점
			break;// 반복문 이탈
		case 7 :
			System.out.println("C 학점");
			break;
		case 6 :
			System.out.println("D 학점");
			break;
		default : // 앞의 조건들 전부 해당안될때 ==> 60점 미만일때
			System.out.println("F 학점");
			break;
			
		}


	}

}
