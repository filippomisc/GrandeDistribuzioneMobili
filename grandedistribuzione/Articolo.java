package grandedistribuzione;

public class Articolo {
	
	private int c;
	private String n;
	private String d;
	private double p;
	
	public Articolo(int c, String n, String d, double p) {
		this.c = c+100;
		this.n = n;
		this.d = d;
		this.p = p;
	}

	
	public int getC() {
		return c;
	}

	public String getN() {
		return n;
	}

	public String getD() {
		return d;
	}

	public double getP() {
		return p;
	}

	@Override
	public String toString() {
		return c + " " + n + " " + d + " " + p;
	}
	
	




}