package Review_Ch04;

import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("10보다 큰 숫자를 입력하세요.");
		int x = s.nextInt(); // x변수를 키보드 입력값으로 받음
		int sum = 0; // sum에 0을 할당
		
		do {//do문을 1회 실행
			sum += x;//x값을 계속 sum에 더함
			x--; // x값은 점차 감소함		
			
		}while(x >= 10);// x값의 감소는 10 이상일때까지 이뤄짐
		System.out.println("합계 : " + sum);// 10부터 x까지의 합 sum을 출력
	}
}
