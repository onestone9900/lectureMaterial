package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int result;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է����ּ��� : ");
		firstNumber = scan.nextInt();
		System.out.println("�� ��° ���� �Է����ּ��� : ");
		secondNumber = scan.nextInt();
		
		result = firstNumber + secondNumber;
		System.out.println("���: " + result);
		scan.close();
	}

}
