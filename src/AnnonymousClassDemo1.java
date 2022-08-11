
public class AnnonymousClassDemo1 {
	public static void main(String[] args) {
		AnnonymousClassDemo1 acd = new AnnonymousClassDemo1(); // 멤버 메소드와 클래스를 사용하기 위해 주소 생성
//		acd.exec(acd.new MyPlus()); //MyPlus 호출
//		acd.exec(acd.new MyMultiple()); // MyMultiple 호출
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) { // 익명 클래스
				return a + b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a * b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a / b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a - b;
			}
		});
	}

	void exec(MyInterface mi) { // 멤버메소드 MyInterface의 자식을 보내라
		int result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
	}

//	class MyMultiple implements MyInterface{ // 이름이 확실하게 있으면 익명클래스가 아님
//		@Override
//		public int calculate(int front, int back) {
//			return front * back ;
//		}
//	}
//	
//	class MyPlus implements MyInterface{ // 멤버 클래스
//		@Override
//		public int calculate(int front, int back) {
//			return front + back ;
//		}
//	}
}

@FunctionalInterface
interface MyInterface {
	int calculate(int front, int back);
}