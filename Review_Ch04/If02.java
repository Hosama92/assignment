package Review_Ch04;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		
		Scanner s =new Scanner(System.in);
		int num = s.nextInt();
		
		if ( num % 2 == 0) {//num값을 2로 나눈값이 0일때 ==> 짝수일때
			System.out.println(num +"은 짝수입니다.");// 짝수입니다 출력
		}
		else {
			System.out.println(num +"은 홀수입니다.");//num값을 2로 나눈값이 0이 아닐때
			// ==>1일때 ==>홀수일때
			//홀수입니다 출력
		}
		System.out.println("이 문장은 if문 외부에 있습니다.");
	}
}
