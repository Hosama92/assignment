package Review_Ch04;

import java.util.Scanner;

public class assign4_06 {
	//[예제 4-7]를 switch문으로 변경하여 코드를 작성하고 실행하세요
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = 1;
		while ( choice == 1) {
			int a;
			
			System.out.println("숫자를 입력하세요.");
			a = s.nextInt();
			
			switch(a %2) {
			case 1:
				System.out.println("홀수입니다.");
				break;
			default:
				System.out.println("짝수입니다.");
				break;					
			}
			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요");
			
			choice = s.nextInt();
		}
		
		System.out.println("모든 숫자를 확인했습니다.");
	}

}
