package Review_Ch03;

public class Example03 {

	public static void main(String[] args) {
		int x = 10;
		//int형 변수 x 선언
		System.out.println(x < 10 && x < 20);
		//AND연산은 둘다 true여야 true,나머지는 false 
		//x < 10 은 false, x < 20 은 true
		//따라서 false
		System.out.println(x < 10 || x < 20);
		//OR연산은 둘중 하나만 true여도 true
		//x < 20 이 true 이므로 true
		System.out.println(!(x < 10 && x < 20));
		//NOT연산은 결과값을 부정, 괄호안의 명제는 false이므로 !가붙으면 true가 된다
	}

}
