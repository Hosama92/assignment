package Review_Ch03;

public class Example06 {

	public static void main(String[] args) {
		int i = 100;//정수형 변수 i를 선언과 초기화
		long l = i;//int형 변수를 long형으로 형변환(더 큰 범위이기때문에 데이터 손실 x)
		float f = l;//long형 변수를 float형으로 형변환
		//형변환시 변수뒤에 기존에 값처럼 f,L등을 적으면 안됨(다른 변수값으로 인식)
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
	}
}
