package Review_Ch03;

public class Example05 {

	public static void main(String[] args) {
		int x = 10;
		// 초기 x값 10
		System.out.println(x++);
		// x값 10을 출력, 그 후에 +1증가 ==> 현재 x = 11
		System.out.println(++x);
		// x값 11에 +1을 하고 그 값을 출력  ==> 현재 x = 12
		System.out.println(x--);
		// x값 12를 출력, 그 후에 -1감소  ==> 현재 x = 11
		System.out.println(--x);			
		// x값 11에 -1을 하고 그 값을 출력  ==> 현재 x = 10


	}

}
