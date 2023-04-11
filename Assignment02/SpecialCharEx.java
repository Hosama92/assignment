package Assignment02;

public class SpecialCharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//전체적으로 역슬래쉬를 이용해 이스케이프 문자를 출력하는 문제이다
		System.out.println('\'');//'는 앞에 역슬래쉬를 넣어줘야 인식이 된다
		System.out.println("abc\t123\b456");//abc문자열을 출력후 탭,123출력후 백스페이스,456순으로 출력
		System.out.println('\n');//줄바꿈 실행
		System.out.println("\"Hello\"");//"를 출력하기위해 앞에 역슬래쉬를 취해주고 Hello를 출력
		System.out.println("c:\\");//역슬래쉬 자체를 출력하기 위해 역슬래쉬를 앞에 취해준다.
	}

}
