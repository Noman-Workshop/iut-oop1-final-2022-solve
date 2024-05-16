package org.example.ques1.library.isbn;

public class ISBN13 extends ISBN {
	
	public ISBN13(String value) {
		super(13, value);
	}
	
	@Override
	public boolean isValid() {
		if (this.getValue()
		        .length() != 13) {
			return false;
		}
		int sum = 0;
		for (int i = 0; i < 12; i++) {
			int digit = this.getValue()
			                .charAt(i) - '0';
			if (digit < 0 || digit > 9) {
				return false;
			}
			sum += (i % 2 == 0) ? digit : 3 * digit;
		}
		int last = this.getValue()
		               .charAt(12) - '0';
		if (last < 0 || last > 9) {
			return false;
		}
		return (10 - sum % 10) % 10 == last;
	}
}
