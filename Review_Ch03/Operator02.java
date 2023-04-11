package Review_Ch03;

public class Operator02 {

	public static void main(String[] args) {
		int a = 10,b = 25;
		// a의 값은 10,b는 25
		System.out.println("a == b = " + (a == b));
		// 10 == 25 거짓이므로 false 출력
		System.out.println("a != b =" + (a != b));
		// 10 !=25 참이므로 true 출력
		System.out.println("a > b = " + (a > b));
		// 10 > 25 거짓이므로 false 출력
		System.out.println("a < b = " + (a < b));
		// 10 < 25 참이므로 true 출력
		System.out.println("b >= a = " + (b >= a));
		// 25 >= 10 참이므로 true 출력
		System.out.println("b <= a = " + (b <= a));
		// 25 <= 10 거짓이므로 false 출력   


	}

}
