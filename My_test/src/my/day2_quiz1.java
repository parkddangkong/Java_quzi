package my;

import java.util.Scanner;

public class day2_quiz1 {
	public static void main(String[] args) {
		/*
		 *		두 정수를 입력받아서 합계를 구하고,
		 *		a + b = c 의 형식으로 
		 *		정답을 포함한 수식을 화면에 출력해주세요 		
		 */
		
		// 1) 코드를 진행하기 위해 필요한 변수가 무엇이고, 몇개인지 파악
		Scanner sc = new Scanner(System.in);
		int n1, n2, answer;
		
		// 2) 고정값은 변수에 초기값으로 넣는다 (상수)
		//	    입력값을 받아서 변수에 저장한다
		System.out.print("첫번째 정수 입력 : ");
		n1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("두번째 정수 입력 : ");
		n2 = Integer.parseInt(sc.nextLine());
		
		// 3) 연산이 필요한 값은 입력 이후 처리한다
		answer = n1 + n2;
		
		// 4) 필요한 값을 출력한다 (추가로 서식을 지정해도 된다)
		System.out.println(n1 + " + " + n2 + " = " + answer);
		
		// 5) 코드가 종료되기 전 마무리 작업을 수행한다
		sc.close();
		
	}
		
		
}
