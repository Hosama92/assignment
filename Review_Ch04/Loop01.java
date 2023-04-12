package Review_Ch04;

import java.util.Scanner; // 스캐너 패키지 임포트

public class Loop01 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("5개의 숫자를 입력하세요.");
		
		for (int n =1; n <= 5;n++) { // for 문에서 n이 1부터 5까지일때 점차 증가
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			sum += num;//sum값에 키보드로부터 받은 int형 변수 num 값을 계속해서 더함
		}
		
		System.out.println("합계 : "+sum);// sum값 출력


	}

}
