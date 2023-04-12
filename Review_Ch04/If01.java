package Review_Ch04;

import java.util.Scanner;//스캐너 패키지 임포트

public class If01 {

	public static void main(String[] args) {
		System.out.println("당신의 나이를 입력하세요."); 
		
		Scanner s = new Scanner(System.in);//스캐너 객체 생성
		int age = s.nextInt();// 입력 매서드 호출
		
		if (age >= 18) { // 조건 age가 18이상일때
			System.out.println("당신의 나이는 18세 이상입니다."); //다음 문자열 출력
			System.out.println("당신은 투표할 자격이 있습니다.");
		}
		
		System.out.println("이 문장은 if문 외부에 있습니다."); // if문 이탈후 문자열 출력
	}
}
