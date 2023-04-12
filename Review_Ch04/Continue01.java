package Review_Ch04;

public class Continue01 {

	public static void main(String[] args) {// 이중for문
		for (int i = 1; i <= 4; i++) {// i값을 4까지 점차증가
			for(int j = 1; j <= 3; j++) {// j값은 3까지 점차 증가
				if(i == 3 && j == 2) {// AND문 ==> i가 3이고 j가 2일때
					continue;// continue수행 ==> 뒤에 프린트를 수행하지 않고 반복문의 끝으로 이동
				}
				System.out.println(i + " * "+j);
			}
		}


	}

}
