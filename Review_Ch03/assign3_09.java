package Review_Ch03;

public class assign3_09 {

	public static void main(String[] args) {
		
		float f = 9.123456789f;
		//float형은 소수아래 8자리까지 표현가능,뒤에 f를 안붙이면 오류남
		//9자리까지 표현가능하다고 하는데 8자리에서 반올림하는거같다 >> 1의자리와 . 도 포함되서 그럼
		//1의자리가 존재하면 표현가능 자릿수가 줄어든다
		//double형은 안붙여도 괜찮
		double d = 9.123456789;
		//double형은 소수아래 16자리까지 표현가능,이것도 17자리까지 표현가능하다 하는데
		//1의자리 + 반올림한자리 -2되서 15자리까지 되는거같다.
		double d2 = (double) f;
		//자동 형변환인데 기존 출력된 f값보다 넓은 범위값들은 쓰레기 값들이 들어간것이다		
		
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("d2 = " + d2);
	}
}
