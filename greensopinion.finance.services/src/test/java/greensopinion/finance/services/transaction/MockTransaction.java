package greensopinion.finance.services.transaction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.google.common.base.Throwables;

public class MockTransaction {
	/**
	 * @param date
	 *            the date in "yyyy-MM-dd" format
	 * @param description
	 *            the description
	 * @param amount
	 *            the amount
	 * @return
	 */
	public static Transaction create(String date, String description, long amount) {
		try {
			return new Transaction(dateFormat().parse(date), description, amount);
		} catch (ParseException e) {
			throw Throwables.propagate(e);
		}
	}

	private static DateFormat dateFormat() {
		return new SimpleDateFormat("yyyy-MM-dd");
	}

	private MockTransaction() {
		// prevent instantiation
	}
}
