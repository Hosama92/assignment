package Review_Ch04;

public class assign4_09 {

	public static void main(String[] args) {
		int sum = 0; //변수 sum 을 0으로 초기화
		for(int i = 0; i < 10; i++) {
			sum = sum + i;//0~9까지 i가 증가하는동안 i 값을 전부 sum에 더함
			//sum += i랑 같은 식
		}
		System.out.println("sum: " + sum);// sum값 출력
		
		//이중 for문으로 구구단 구현
		for(int i = 1; i < 10; i++) {
			System.out.println("**********");
			System.out.println("구구단 " + i + " 단");
			System.out.println("**********"); //구구단 몇단인지 표현하고 타이틀 만듬
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j +" = "+i*j); 
				//이중for문에서 내부반복문의 j가 점차 증가하면서 구구단을 구현
			}
		}
	}
}
