package Review_Ch03;

public class Operator05 {

	public static void main(String[] args) {
		int a = 10,b = 10,c = 10,d = 10;
		// 변수 a b c d를 전부 10으로 초기화
		System.out.println("a++ => " + (a++));
		// a값을 출력후 +1해줌 ==> 출력값 : 10, 현재값 : 11
		System.out.println("a => " + a);
		// 현재 a값을 출력
		System.out.println("++b => " + (++b));
		// b값을 +1을 한 후에 출력
		System.out.println("c-- => " + (c--));
		// c값을 출력 후 -1
		System.out.println("--d => " + (--d));
		// d값을 -1을 한 후에 출력
	}

}
