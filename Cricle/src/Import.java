import java.util.Scanner;

public class Import {
	private double d,r;

	public Import(double d, double r) {
		this.d = d;
		this.r = r;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Import [d=" + d + ", r=" + r + "]";
	}
	
	public double dienTich() {
		
		return this.d * this.r;
	}
	public double chuVi() {
		return ((this.d*2)+(this.r)*2);
	}
}
