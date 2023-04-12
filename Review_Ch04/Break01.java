package Review_Ch04;

public class Break01 {

	public static void main(String[] args) {
		for (int i = 0;i < 10; i++) {// i는 0부터 9까지 점차증가
			if(i == 5)// 조건 i 는 5일때
				break;// 반복문 이탈
			System.out.println("i : " + i);
		}
	}
}
