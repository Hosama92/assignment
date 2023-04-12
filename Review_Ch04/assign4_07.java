package Review_Ch04;

import java.util.Scanner;

/*switch 문을 이용하여 다음 조건을 만족하는 프로그램을 작성하세요.
• 화면에 “[메뉴] 1:검색 2:등록 3:삭제 4:변경 >” 을 표시합니다.
• 키보드로 숫자를 입력하고, 변수 selected에 대입합니다.
• 만약 변수 selected가 1이면 “검색합니다.”, 2이면 “등록합니다.”, 3이면 “삭제합니다.”, 4이면 “변경합니다.”를
표시합니다.
• selected가 1부터 4사이의 값이 아니라면 아무것도 하지 않습니다.*/

public class assign4_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = 1;
		while(a == 1) {
			int selected;
			
			System.out.println("[매뉴] 1:검색 2:등록 3:삭제 4:변경 >");
			selected = s.nextInt();
			
			switch(selected) {
				case 1:
					System.out.println("검색합니다.");
					break;
				case 2:
					System.out.println("등록합니다.");
					break;
				case 3:
					System.out.println("삭제합니다.");
					break;
				case 4:
					System.out.println("변경합니다.");
					break;
				default:
					break;			
			}
		}
	}
}
