package grandedistribuzione;

public class Negozio {
	
	private int c;
	private String n;
	private String i;
	private int nmax;
	
	public Negozio(int c,String n, String i, int nmax) {
		this.c = c+1;
		this.n = n;
		this.i = i;
		this.nmax = nmax;
	}

	public int getC() {
		return c;
	}
	
	public String getN() {
		return n;
	}

	public String getI() {
		return i;
	}

	public int getNmax() {
		return nmax;
	}

	@Override
	public String toString() {
		return c + " " + n + " " + i + " " + nmax + " ";
	}
	
	
	
	

}
