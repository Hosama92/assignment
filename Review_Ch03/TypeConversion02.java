package Review_Ch03;

public class TypeConversion02 {

	public static void main(String[] args) {
		int x = 10;//정수형 x = 10
		double y = 3.0;//실수형 y = 3.0
		
		System.out.println(x / y);
		// 10 / 3.0은 실수형으로 계산되어짐(자동형변환) ==> 3.333333...
		System.out.println(x / (int)y);
		// 10 / 3 ==>y값을 정수형으로 캐스팅해서 3이됨 결과값도 정수가됨 ==> 3
		System.out.println((int) (x / y));
		// (10 / 3.0)을 정수형으로 캐스팅 ==> 소수점을 버려서 3이 됨


	}

}
