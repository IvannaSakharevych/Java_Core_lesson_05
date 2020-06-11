package Task2_Overload;

public class Main {
	String a;
	String b;
	String c;

	public Main(String a, String b) {
		this.a = a;
		this.b = b;
	}

	public Main(String a, String b, String c) {
		this(a, b);
		this.c = c;
	}
	

@Override
	public String toString() {
		return "" + a + " " + b + " " + c + ""+ ":)" +"";
	}

public static void main(String[] args) {
	Main m = new Main ("Я", "вчу", "Java");
	System.out.println(m);
}
	
}
