package Review_Ch04;

import java.util.Scanner;

public class assign4_05 {
// [예제 4-5]를 if문으로 변경하여 코드를 작성하고 실행하세요.
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if((num / 10)>=9) {
			System.out.println("A 학점");
		}
		else if((num / 10)>=8) {
			System.out.println("B 학점");
		}
		else if((num / 10)>=7) {
			System.out.println("C 학점");
		}
		else if((num / 10)>=6) {
			System.out.println("D 학점");
		}
		else {
			System.out.println("F 학점");
		}
	}

}
