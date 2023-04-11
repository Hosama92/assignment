package Review_Ch03;

public class Operator04 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;// c는 선언만 하고 초기화 안함
		System.out.println(c = a);// c를 a값으로 초기화(c = 10)하고 그 값을 출력 
		System.out.println(b += a);// b를 b+a로 초기화(10 + 20 = 30)
		//b값은 초기화된 값으로 계속 변경
		System.out.println(b -= a);// b를 b-a로 초기화(30 - 10 = 20)
		System.out.println(b *= a);// b를 b*a로 초기화(20 * 10 = 200)
		System.out.println(b /= a);// b를 b/a로 초기화(200 / 10 = 20) 
		System.out.println(b %= a);// b를 b%a로 초기화(20 % 10 = 0)


	}

}
