
public class ExceptionDemo2 {
	public static void main(String[] args) {
		a();
	}
	static void a(){
		try {
		b();
		}catch(ArithmeticException ex) { // 처리함
			System.out.println("여기서 잡았음.");
		}
		
	}
	static void b() {
		c(); // Exception 발생
	}
	static void c() {
		d(); // Exception 발생
	}
	static void d() {
		System.out.println(5/0); // Exception 발생
	}
}
