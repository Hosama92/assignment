package Review_Ch04;

public class Example12 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {// i 는 0부터 10까지 점차 증가 
			if (i == 3||i == 6 || i == 9) { // 조건문에 OR로 조건을 묶음
				//i가 3이거나 6이거나 9이거나 할때
				continue;// continue수행 ==> 반복문의 끝으로 이동 ==> i가 증가되고 다시 반복문 수행
				//결과적으로 3 6 9 는 출력에서 제외
			}
			System.out.print(i+" ");
		}


	}

}
