package Review_Ch04;

import java.util.Scanner;

public class Loop04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("길이 : ");
		
		
		int len = s.nextInt(); // len에 키보드 입력값을 할당
		
		for(int i = 0; i < len; i++) {// i값이 len보다 작을때까지 i 증가
			for(int j = 0; j < i; j++) {//j값은 i값보다 작을때까지 증가
				System.out.print(" ");//여백 출력
			}
			for(int j = 0;j <(2*len)-1-(i*2);j++) {
				//j값이 len*2 - 1 - i*2까지 증가
				System.out.print("*");//이때 반복하면서 *를 출력
			}
			System.out.println("");//줄바꿈
		}

	}

}
