package application;

public class Menu {
	String name;
	String img;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Menu() {
	}

	public Menu(String name, String img) {
		this.name = name;
		this.img  = img;
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + ", img=" + img + "]";
	}
}
