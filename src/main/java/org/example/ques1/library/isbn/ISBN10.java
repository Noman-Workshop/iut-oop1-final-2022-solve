package org.example.ques1.library.isbn;

public class ISBN10 extends ISBN {
	
	public ISBN10(String value) {
		super(10, value);
	}
	
	@Override
	public boolean isValid() {
		if (this.getValue()
		        .length() != 10) {
			return false;
		}
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int digit = this.getValue()
			                .charAt(i) - '0';
			if (digit < 0 || digit > 9) {
				return false;
			}
			sum += (i + 1) * digit;
		}
		char last = this.getValue()
		                .charAt(9);
		if (last == 'X') {
			sum += 10;
		} else {
			int digit = last - '0';
			if (digit < 0 || digit > 9) {
				return false;
			}
			sum += 10 * digit;
		}
		return sum % 11 == 0;
	}
}
