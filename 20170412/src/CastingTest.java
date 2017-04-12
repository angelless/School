
public class CastingTest {
	public static void main(String[] args) {
		byte a = 120;
		int b = a;
		print("b : " + b);

		int c = 127;
		byte d = (byte) c;
		print("d : " + d);

		double e = 456.789;
		int f = (int) e;
		print("f : " + f);
	}

	public static void print(String message) {
		System.out.println(message);
	}
}
