package Review_Ch04;

public class Example10 {

	public static void main(String[] args) {
		// 4단까지의 구구단을 출력
		for(int i = 2; i <= 4; i++) {// i 값은 2부터 4까지 증가
			System.out.println("구구단"+ i + " 단");// i 값 출력
			
			for(int j = 1; j <=10;j++) {//이중 for문으로 j값을 1부터 10까지 증가시켜줌
				System.out.println(i + " * "+ j + " = "+(i*j));
				//i값(각 단)과 j값을 곱해서 구구단을 구현
			}
		}


	}

}
