package Review_Ch02;

public class Example01_2 {

	public static void main(String[] args) {
		final int SPEED = 20;//SPEED를 상수값으로 선언
		int count = 10;//변수 count를 선언
		SPEED = 40;//상수값이기 때문에 변경할수 없음.
		count = 11;//count를 11로 초기화
		
		System.out.print("상수 SPEED 값은");//문자열 출력
		System.out.print(SPEED);//SPEED값 출
		System.out.print("변수 count 값은");
		System.out.print(count);
	}
}
