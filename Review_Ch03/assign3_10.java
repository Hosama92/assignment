package Review_Ch03;

public class assign3_10 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x < 3);
		//x + 1 은 3인데 3 < 3 이 성립안되므로 false가 나온다
		System.out.println(y >= 5 || x < 0 && x > 2);
		//연산 우선순위는 &&부터이므로 
		// x < 0 && x > 2 => false
		// y >= 5 => true 인데 or연산으로 묶여있으므로 둘중하나가 true 니까 true출력
		System.out.println(y += 10 - x++);
		//y += 10 은 y값을 y값에 10을 더한값으로 초기화한것이고
		// - x++는 x값을 증가시키기전 연산을 수행하고 x값을 증가시킨것이다
		//따라서 값은 (5+10)-2 가되어 13이 된다		
		System.out.println(!('A' <= c && c <= 'Z'));
		// 문자형 c의값은 'A'이다 따라서 괄호안의 명제는 true가 된다
		//(Z의 아스키코드값 90,A는 65),true인 명제를 부정했으므로 false가 된다
		System.out.println('C'-c);
		//아스키 코드에서 A B C D ...순으로 나열되있으므로 C - A는 2개차이가 난다
		System.out.println(c+1);
		//아스키 코드에서 A값은 65이므로 c+1은 66이다
		//B가 될수도 있는데 왜 66이냐면 자동형변환(int형이 char형보다 범위가 넓음)이 일어나서
		//char형이 아닌 int형으로 출력이 된것이다
		System.out.println(c++);
		//c를 출력후 증가연산이여서 A출력
		System.out.println(c);
		//증가된 c값 = B
		System.out.println(++c);
		//c를 증가시키고 출력 = C
	}
}
