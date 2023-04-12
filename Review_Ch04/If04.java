package Review_Ch04;

import java.util.Scanner;//스캐너 패키지 임포트

public class If04 {

	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요.");
		
		Scanner s = new Scanner(System.in); // 스캐너 객체 생성
		int x = s.nextInt();// 변수 x,y,z에 각각 키보드 입력값으로 받은 int형 메서드 호출
		int y = s.nextInt();
		int z = s.nextInt();
		
		if(x > y) {// x > y일때
			if (x > z) {// x > y이고 x > z 일때
				System.out.println(x + "는 가장 큰 정수입니다."); 
			}
			else {// x > y 이고 x > z 가 아닐때
				System.out.println(x +"는 가장 큰 정수가 아닙니다.");
			}
		}
		else {// x > y 가 아닐때
			System.out.println(x +"는 가장 큰 정수가 아닙니다.");
			
		}

	}

}
