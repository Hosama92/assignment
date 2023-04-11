package Review_Ch03;

public class assign3_07 {

	public static void main(String[] args) {
		String s = "12345";
		//문자열 s에 12345값 대입
		int i = Integer.parseInt(s);
		//Integer.parseInt는 문자열을 숫자로 변환해주는 기능이있음
		//비슷한걸로 
		//Byte.parseByte()
		//Short.parseShort()
		//Long.parseLong() 등이 있음
		System.out.printf("문자를 숫자로 %d (%d) \n",i, i + 10);
		//c에서 처럼 %d등을 사용하기 위해 println이 아닌 printf를 이용
		//i값이 12345인데 + 10을 숫자로 받아서 계산해
		//i + 10은 1234510 이 아닌 12355가 된다
		String a;
		//문자열 a 선언
		a = String.format("%d", i);
		//String.format은 문자열의 형식을 설정할때 사용.
		//여기서는 문자열로 정수형의 i를 받아옴
		System.out.printf("숫자를 문자로 %s (%s) \n", a, a+"abcde");
		//첫번째 a값은 %s형으로 받음. 즉,정수 i를 문자열 형식으로 변환해 
		//받아온 것이므로 숫자가 아닌 문자화 되있는 12345이다
		//따라서 +를 사용했을때 아까처럼 연산이 되는게 아닌 뒤에 출력하게되어
		//12345abcde가 된다.
	}
}
