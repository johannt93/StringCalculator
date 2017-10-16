package is.ru.hugb;

import org.joda.time.DateTime;
//import static spark.Spark.*;

public class StringCalculator{
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String str = "10";
		System.out.println(calc.add(str));
		//get("/", (req, res) -> calc.add(str));
		//get("/daysleft", (req, res) -> daysLeft());
	}
	
	public static String today() {
		DateTime today = new DateTime();
		return today.dayOfWeek().getAsText();
	}
	
	public static String daysLeft() {
		DateTime day = new DateTime();
		String curDay = day.dayOfYear().getAsText();
		int remainingDays = 365 - Integer.parseInt(curDay);
		return "Days left of year: "+ remainingDays;
	}
}