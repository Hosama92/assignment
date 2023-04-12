package Review_Ch04;

import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = 1; // choice값 1로 초기화
		while ( choice ==1) {//choice값은 다시 초기화 시키지 않는이상 계속 1 ==> 무한반복
			int a;
			
			System.out.println("숫자를 입력하세요.");
			a = s.nextInt();//a값을 키보드 입력값으로 할당
			
			if (a % 2 == 0) {//a를 2로 나눈 나머지가 0일때 ==> 짝수일때
				System.out.println("짝수입니다.");				
			}
			else {
				System.out.println("홀수입니다.");
			}
			System.out.println("계속하고 싶다면 예 1,그만하고 싶다면 아니요 0을 입력하세요.");
			
			choice = s.nextInt();//choice값을 키보드 입력으로 초기화
			//==>1이 아니면 반복문 종료
			
			
		}
		System.out.println("모든 숫자를 확인했습니다.");
	}

}
