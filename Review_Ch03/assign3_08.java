package Review_Ch03;

public class assign3_08 {

	public static void main(String[] args) {
		double d = 85.4; 
		//d의 값은 실수형 85.4이다
		int score = (int)d;
		//정수형 변수 score는 실수형 변수 d를 정수형으로 형변환 한 값이다
		//double의 범위가 더 넓으므로 이 경우는 캐스팅 형변환이 되고
		//따라서 데이터의 일부인 소수점이 삭제된다
		System.out.println("score=" + score);
		//score는 d값에서 소수점이 삭제된 85이다
		System.out.println("d=" + d);
		//d는 소수점이 존재하는 85.4이다
	}
}
