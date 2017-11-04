package tdd.tdc.domain;

public class InfoFromAnotherSystem {
	
	private GetTotal authenticate;
	
	public InfoFromAnotherSystem(GetTotal a) {
		this.setAuthenticate(a);
	}
	
	public int calculateTotal() {
		// Do some calculations with the result of class Authenticate
		int total = authenticate.doGetTotals() +2;
		return total;
	}
	
	public static int calculeSomethingStatic(int num) {
		int total = num + GetTotal.getStaticTotal();
		return total;
	}

	public GetTotal getAuthenticate() {
		return authenticate;
	}

	public void setAuthenticate(GetTotal authenticate) {
		this.authenticate = authenticate;
	}

}
