
		/*
		 * -기본 for문과 다중 for문에 대하여 설명하고 간단히 예를 들어보세요
		 * 	> for문은 for (초기화식;조건식;증감식) 으로 구성되 있으며 다중 for문은 for 문안에 
		 * 	 다른 for문을 추가하여 외부식 반복동안 내부식이 반복하는 구조로 작동한다.
		 * 
		 * 	 ex) int a = 0; 
		 * 		for(i = 1; i <= 10; i++) {
		 * 			a += i;
		 * 		}
		 * 		 System.out.println(a); 
		 * // for문을 통해 1 부터 10까지 수의 합을 구하는 방식
		 *		 int i,j;	 
		 * 		 for(i = 0; i < 5; i++) {
		 * 			for(j = 0; j < i; j++) {
		 * 				System.out.print("*");				 
		 *  	     }
		 * 				System.out.println("");		
		 *         }
		 * // 다중 for 문을 통해 피라미드 모양 구현         
		 *         
		 *         
		 *         
		 * -for문과 while문의 변환관계를 설명하고 간단히 예를 들어보세요
		 * 	> for문을 while로 변환할때는 초기화식을 먼저 입력해서 변수를 초기화해주고
		 * 	 while 괄호 안에 조건식을 기입, 그후 while문 안에서 증감식을 넣어주면 된다.
		 * 
		 * 	 ex) int a = 0,i = 1;
		 * 		 while(i <= 10) {
		 * 			a += i;
		 * 			i++;
		 * 		  }
		 * 		 System.out.println(a);
		 *  //위의 for 문을 while문으로 바꾼 예시
		 *  
		 *  
		 *  
		 *  -break문과 continue문을 설명하고 간단히 예를 들어보세요
		 *  > break는 반복문을 중단하는 기능, continue는 특정 조건을 건너뛰고 반복문을 실행하는 기능
		 *  
		 *   ex) int i,j;	 
		 * 		 for(i = 0; i < 5; i++) {
		 * 			for(j = 0; j < i; j++) {
		 * 				System.out.print("*");
		 * 			 
		 *  	     }
		 *  			if(i == 3) {
		 *  				break;
		 *  			}
		 *  		}
		 * 				System.out.println("");		
		 *         }
		 *  //원래 i = 4까지 출력되야되지만 break문때문에 i = 3에서 중단
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
