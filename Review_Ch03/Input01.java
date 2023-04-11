package Review_Ch03;
import java.util.Scanner;
//Scanner패키지 import
public class Input01 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		// 스캐너 객체 s1 생성(키보드값으로 입력받음)
		System.out.println("정수값 입력하기");
		int n = s1.nextInt();
		// 메서드가 nextInt이므로 int형을 입력받음
		// 정수형 변수 n은 키보드로 입력한 정수를 받는 변수
		
		System.out.println("실숫값 입력하기");
		double db = s1.nextDouble();
		// 실수형 변수 db는 키보드로 입력한 double형을 받음
		System.out.println("정숫값 : " +n);
		System.out.println("실숫값 : " + db);
		// 각 변수값 출력
	}

}
