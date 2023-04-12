package Review_Ch04;

public class Example01 {

	public static void main(String[] args) {
		int num = 10;//int형 변수 num을 10으로 초기화
		
		if (num > 15) {//조건문에 num이 15보다 클때
			System.out.println("숫자가 15보다 큽니다.");// 조건이 true일때 문자열 출력
		}
		
		System.out.println("이 문장은 if문 외부에 있습니다."); // 조건문 끝나고 문자열 출력
	}
}
