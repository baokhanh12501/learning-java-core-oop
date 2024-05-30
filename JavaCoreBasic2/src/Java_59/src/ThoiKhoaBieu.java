
public class ThoiKhoaBieu {
	private Day day;
	private String monHoc;

	public ThoiKhoaBieu(Day day, String monHoc) {
		super();
		this.day = day;
		this.monHoc = monHoc;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public String getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}

	@Override
	public String toString() {
		return "ThoiKhoaBieu [day=" + day + ", monHoc=" + monHoc + "]";
	}
	
}
