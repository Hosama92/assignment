package Review_Ch04;

public class Example03 {

	public static void main(String[] args) {
		int num = 20; // int형 변수 num 에 20을 할당
		
		if (num == 10) { // num 이 10 일때
			System.out.println("숫자가 10 입니다."); // 숫자가 10 입니다. 출력			
		}
		else if (num == 15) {// num 이 15 일때
			System.out.println("숫자가 15 입니다."); // 숫자가 15 입니다. 출력			
		}
		else if (num == 20) {// num 이 20 일때
			System.out.println("숫자가 20 입니다.");// 숫자가 20 입니다. 출력			
		}
		else {// 위의 조건에 전부 만족하지 않을때
			System.out.println("숫자가 존재하지 않습니다.");// 숫자가 존재하지 않습니다. 출력
		}
	}
}
