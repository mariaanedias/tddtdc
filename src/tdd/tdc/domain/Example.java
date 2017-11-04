package tdd.tdc.domain;

public class Example implements TestIF {

	private String string;
	
	public void setString(String newString) {
		this.string =  newString;
	}

	public String getString() {
		return string;
	}
}
