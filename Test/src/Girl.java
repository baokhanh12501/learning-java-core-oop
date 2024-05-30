public class Girl{
    private Outfit outfit;
    public Girl(Outfit anything){
      this.outfit = anything; // Tạo ra một cô gái, với một món đồ tùy biến
      // Không bị phụ thuộc quá nhiều vào thời điểm khởi tạo, hay code.
    }
	@Override
	public String toString() {
		return "Girl [outfit=" + outfit + "]";
	}
    
}

