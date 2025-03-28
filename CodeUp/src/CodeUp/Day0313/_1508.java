package CodeUp.Day0313;

import java.util.Scanner;

// 4
// 6 2
// 9 3 1
// 19 10 7 ?
// 각 행의 제일 첫 번째 숫자들만 주어지면 N크기의 모든 격자판 정보를 출력하는 프로그램을 작성하시오.

// 첫 줄에 이 삼각격자의 세로 길이 N이 입력된다.(2 <= N <= 20)
// 둘째 줄부터 N+1째 줄까지 (k, 1)의 격자판의 정보가 입력된다. ( 1 <= k <= N)
//
// N크기의 삼각 격자판을 출력하시오.
// (출력할 때 각 행의 마지막에 공백을 넣어 출력하세요.(표현 오류때문))
public class _1508 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("줄 수 : ");
		int row = sc.nextInt();

		int number[][] = new int[row][];

		System.out.print("각 행의 첫 숫자 입력 : ");

		for (int i = 0; i < number.length; i++) {
			number[i]    = new int[i + 1];
			number[i][0] = sc.nextInt();
		}

		sc.close();

		for (int i = 1; i < number.length; i++) {

			for (int j = 1; j < number[i].length; j++) {
				number[i][j] = number[i][j - 1] - number[i - 1][j - 1];
				if (number[i][j] < 0)
					number[i][j] *= -1;

			}
		}

		for (int[] is : number) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();

		}
	}
}
