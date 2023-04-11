package Review_Ch03;

public class Operator03 {

	public static void main(String[] args) {
		int a = 5,b = 10;
		// a값은 5,b값은 10
		
		System.out.println(a > b);
		// 5 > 10 은 거짓
		System.out.println(!(a > b));
		// 5 > 10 은 거짓이므로 NOT을 취하면 true가 된다
		System.out.println((a == b) && (a == 5));
		// &&연산은 둘다 true여야 true가 된다, a는b랑 다르므로 false
		System.out.println((a != b) && (a == 5));
		//a는 b랑 같지않고 a값은 5,두 명제가 다 참이므로 true
		System.out.println(!((a != b) && (a == 5)));
		//괄호안의 명제가 참이므로 NOT을 취하면 false
	}
}
