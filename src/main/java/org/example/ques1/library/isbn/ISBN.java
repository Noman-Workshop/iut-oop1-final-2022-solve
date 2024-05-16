package org.example.ques1.library.isbn;

public abstract class ISBN {
	
	private final int noOfDigits;
	private final String value;
	
	protected ISBN(int noOfDigits, String value) {
		this.noOfDigits = noOfDigits;
		this.value = value;
	}
	
	public abstract boolean isValid();
	
	public int getNoOfDigits() {
		return noOfDigits;
	}
	
	public String getValue() {
		return value;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ISBN isbn)) return false;
		
		if (getNoOfDigits() != isbn.getNoOfDigits()) return false;
		return getValue().equals(isbn.getValue());
	}
}
