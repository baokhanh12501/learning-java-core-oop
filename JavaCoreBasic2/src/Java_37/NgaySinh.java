package Java_37;

public class NgaySinh {
private int day,month,year;
	
	
	public NgaySinh(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			if(day>=1&&day<=31)
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			if(month>=1&&month<=12)
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			if(year>=0)
			this.year = year;
		}
}
