package is.ru.hugb;
import org.joda.time.DateTime;

public class Calculator {
	public static int add(String numbers) {
		int left;
		int right;
		int index = 0;
		
		if(numbers.isEmpty()) {
			return 0;
		} else {
			index = numbers.indexOf(',');
			if(index == -1) {
				return Integer.valueOf(numbers);
			} else {
				left = Integer.valueOf(numbers.substring(0,index));
				right = Integer.valueOf(numbers.substring(index+1));
				return left+right;
			}
		}
	}
}