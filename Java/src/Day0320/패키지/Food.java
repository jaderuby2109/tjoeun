package Day0320.패키지;

public class Food extends Product {

	String Kcal;	// 칼로리
	String taste;	// 맛

	// 생성자
	public Food() {
	}

	// getter, setter
	public String getKcal() {
		return Kcal;
	}

	public void setKcal(String kcal) {
		Kcal = kcal;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	// toString
	@Override
	public String toString() {
		return "Food [Kcal=" + Kcal + ", taste=" + taste + "]";
	}
}
