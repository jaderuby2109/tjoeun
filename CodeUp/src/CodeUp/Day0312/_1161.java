package CodeUp.Day0312;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// 정수 두개가 입력으로 들어온다.
// 만약 첫번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후 "+"를 출력한다.
// 그리고 두번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후 "="을 출력하고
// 두 수의 합이 홀수인지 짝수인지 출력한다.
// 예를들어,
// 5 7 이 입력되면 "홀수+홀수=짝수"가 출력된다.
// 5 6 이 입력되면 "홀수+짝수=홀수"가 출력된다.

// 정수 두개가 입력된다.

// 만약 첫번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후 "+"를 출력한다.
// 그리고 두번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후 "="을 출력하고
// 두 수의 합이 홀수인지 짝수인지 출력한다.
public class _1161 {

	public static void main(String[] args) throws Exception {

		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		sc.close();

		String num1Check = num1 % 2 == 0 ? "짝수" : "홀수";
		String num2Check = num2 % 2 == 0 ? "짝수" : "홀수";
		String num3Check = (num1 + num2) % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num1Check + "+" + num2Check + "=" + num3Check);

	}
}
