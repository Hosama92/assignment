package Review_Ch03;

public class assign3_05 {

	public static void main(String[] args) {
		int k01_year = 0; //int형 변수에 값 0 대입
		int k01_age = 14; // int형 변수에 값 14 대입
		
		System.out.println("결과1: " + k01_year); //문자열"결과1:"을 출력하고 변수값 출력
		System.out.println("결과2: " + k01_age); //문자열"결과2:"을 출력하고 변수값 출력
		
		k01_year = k01_age + 2000; //year변수값을 age변수값 + 2000으로 초기화
		k01_age = k01_age + 1; //age 변수값에 1을 더한값으로 초기화
		
		System.out.println("결과3: " + k01_year);
		//앞과 동일하게 결과값 출력(year 값은 2000+14가 됨)
		System.out.println("결과4: " + k01_age);
		//앞과 동일하게 결과값 출력(age 값은 +1된 15가 됨)
	}
}
