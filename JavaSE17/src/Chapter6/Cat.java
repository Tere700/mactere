package Chapter6;

public class Cat {
	String name;
	String birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public boolean equals(Object other) {
		// other參考的就是這個物件，當然是同一物件
		if (this == other) {
			return true;
		}

		// 使用Java SE 16模式比對
		if (other instanceof Cat cat) {
			return getName().equals(cat.getName()) && getBirthday().equals(cat.getBirthday());
		}

		return false;
	}

	public static void main(String[] args) {
		Cat cat =new Cat();
//		cat.setName("Fluffy");
//		cat.setBirthday("2022-01-01");

		if (cat instanceof Object) {
			System.out.println(1111);
		}
//		System.out.println(cat.equals(cat1));
	}
}
