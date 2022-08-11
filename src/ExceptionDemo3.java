
public class ExceptionDemo3 {
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		t=null; // 주소 끊기
		try {
		t.display(); // NullPointerException 주소가 끊겨 받아 올 수가 없음
		}catch (NullPointerException ex) {
//			System.out.println(ex.getMessage()); // null
//			System.out.println(ex); // ex.toString() 오류의 타입
			ex.printStackTrace(); // 오류의 타입과 오류 라인
			
		}
	}
}

class Test{
	public void display() {
		System.out.println("Hello, World");
	}
}
