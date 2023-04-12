package Review_Ch04;

public class assign4_08 {

	public static void main(String[] args) {
		/*int i,j;
		for(i = 0; i < 10; i++) {
			for(j = 0; j <= i; j ++) {
				System.out.print("*");				
			}
			System.out.println("");
		}*/
		// ------------for문으로 구현
		
		int a=0,b=1;
		
		while(b <= 10) {
		while(a < b) {
			System.out.print("*");
			a++;
			
		}
		System.out.println("");
		b++;
		a = 0;
	}
		// ------------------while문으로 구현
 }
}
