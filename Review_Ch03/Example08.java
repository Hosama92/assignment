package Review_Ch03;
import java.util.Scanner; 
// 스캐너 패키지를 import 해줌
// 위치는 패키지명 아래에 기입
// c언어의 #include로 헤더선언하는것과 유사함

public class Example08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//스캐너 클래스의 객체를 생성
		//input은 객체명이고 System.in은 키보드 입력을 받는 객체라는 뜻
		
		System.out.println("당신의 이름을 입력하세요.");
		String name = input.nextLine();
		//문자열 name은 한 행의 문자열을 키보드로 받아서 입력
		//키보드로 이름값을 입력해준다
		System.out.println("당신의 이름 : " + name);
		//키보드로 입력한 이름값 name을 출력
	}

}
