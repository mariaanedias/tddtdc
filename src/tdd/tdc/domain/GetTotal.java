package tdd.tdc.domain;

public class GetTotal {
	
	public int doGetTotals() {
		int num = 0;
		//CALL ANOTHER SYSTEM TO GET THE NUM
		return num;
	}
	
	public static int getStaticTotal() {
		return 5;
	}
	
	public String getTotalAsString(String param) {
		return "20";
	}
	
	public int doSomething() throws MyException {
		//DO SOMETHING
		//DO SOMETHING
		return getTotal(2, 4);
		//DO SOMETHING
		//DO SOMETHING
	}
	
	private int getTotal(int x, int y) {
		Sum s = new Sum();
		return s.sum(x, y);
	}
}
