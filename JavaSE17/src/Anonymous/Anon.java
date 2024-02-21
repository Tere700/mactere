package Anonymous;

public class Anon {
	int x = 1;
	Object obj1 = new Object() {
		@Override
		public String toString() {
			return String.format("obj(%d)", x);
		}
	};

	int y = 1;
	Object obj2 = new Object() {
		@Override
		public String toString() {
			return String.format("obj(%d)", y);
		}
	};

	int n = 1;
	Object obj = new Object() {
		@Override
		public String toString() {
			return String.format("obj(%d)", _n);
		}

		final int _n;
		{
			_n = n;
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
