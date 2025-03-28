package Chapter013.Ex07_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterTest {

	public static void main(String[] args) {
		// 양수를 찾는 Predicate
		Predicate<Integer> isPositive = x -> x > 0;

		List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 43, 7);

		Stream<Integer> s = numbers.stream()
				// 스트림을 이용하여 0보다 큰 값을 추출
				.filter(isPositive);
		s.forEach(n -> System.out.println(n));
	}
}
