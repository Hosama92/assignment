package Review_Ch04;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in);// 스캐너로 입력값 받기
		int grade = s.nextInt(); // 입력값 INT형 변수 grade에 저장
		
		if (grade >= 90) {//grade가 90이상일때
			System.out.println("A 학점");// A학점 출력
		}
		else if (grade >= 80) {//grade가 80이상일때
			System.out.println("B 학점");// B학점 출력
		}
		else if (grade >= 70) {//grade가 70이상일때
			System.out.println("C 학점");// C학점 출력
		}
		else if (grade >= 60) {//grade가 60이상일때
			System.out.println("D 학점");// D학점 출력
		}
		else {//그외에
			System.out.println("F 학점");// F학점 출력
		}


	}

}
