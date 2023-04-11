package Chap03;
import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요.");
		String name = input.nextLine();
		System.out.println("당신의 이름 : " + name);//**한글은 입력이 안됨(인식이안됨)
	}

}
