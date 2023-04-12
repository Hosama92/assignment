package Review_Ch04;

public class Example06 {

	public static void main(String[] args) {
		char grade = 'B'; // 문자형 변수 grade에 B를 할당
		switch(grade) {// switch문을 통해 조건문 구현
		case 'A': // grade가 A일때
			System.out.println("매우 우수");
			break;// 조건문을 이탈
		case 'B':// grade가 B일때
			System.out.println("우수");
			break;
		case 'C':// grade가 C일때
			System.out.println("좋음");
			break;
		case 'D':
			System.out.println("좀 더 열심히");
			break;
		case 'F':
			System.out.println("미흡");
			break;
		default: // 위의 조건이 전부 성립 안할때
			System.out.println("잘못된 등급");//순서상 마지막이므로 break생략 가능
		}
		
	}

}
