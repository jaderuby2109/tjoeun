package Chapter015.Ex01_표준입출력;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char) i);
			System.err.println(i);
			System.err.println((char) i);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
