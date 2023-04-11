package Review_Ch03;

public class TypeConversion01 {

	public static void main(String[] args) {
		int x = 10;
		double y = 3.0;
		// double형의 범위가 더 넓음
		// x는 정수형 10으로, y는 실수형 3.0으로 초기화
		System.out.println(x + y);
		// int형과 double형의 연산이므로 결과값은 더 큰 변수형인 double형으로 변환
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	}

}
