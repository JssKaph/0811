
public class WrapperClassDemo {
	public static void main(String[] args) {
		// Until JDK 1.4
//		int age = 26; // stack
//		Integer in = new Integer(age); // boxing, wrapping
//		int su = in.intValue();	//unboxing, unwrapping
//		System.out.println("su = "+su);

		// Since JDK1.5
		Integer in = 26 + 5; // Integer in = new Integer(26 + 5); 주소변수가 바로 자동으로 "박스"에 담아줌, autoboxing
		int su = in + 100; // in.IntValue() +100; 컴파일러가 자동으로 해준다.
		System.out.println("su = "+su);
	}
}
