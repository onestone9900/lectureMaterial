package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int result;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력해주세요 : ");
		firstNumber = scan.nextInt();
		System.out.println("두 번째 수를 입력해주세요 : ");
		secondNumber = scan.nextInt();
		
		result = firstNumber + secondNumber;
		System.out.println("결과: " + result);
		scan.close();
	}

}
