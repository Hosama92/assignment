package Review_Ch04;

public class Example09 {

	public static void main(String[] args) {//do~while문은 do 문을 실행하고 while문 반복을 실행
		int i = 1;
		do {//while 조건과 상관없이 do문을 1회 실행
			System.out.println("Hello World");//문자열 출력(1회)
			i++;// i값 증가(현재 i = 2)
		}while(i < 6);// i가 6이되기 전까지 반복
		// 즉 i가 2, 3, 4, 5일때 값이 출력
		// 초기 do문에 출력값까지 총 5번 출력됨

	}

}
