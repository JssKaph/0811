
public class AnnonymousClassDemo { // 재정의를 하고 싶지만 상속은 받기 싫을때 익명클래스사용
	public static void main(String[] args) {
		Demo d = new Demo() { // 익명개체
			@Override
				public void display() {
					System.out.println("나는 재정의된 메소드");
			}
//			public void print() { // 안보임 (재정의의 원형이 없음), 익명 클래스는 새로운 기능을 붙이지는 못한다. (extends가 아님)
//				System.out.println("나는 새로운 메소드");
//			}
		}; // 익명클래스는 세미콜론을 꼭 써야함
		d.display();
//		d.print(); // 재정의 하려는 클래스의 멤버가 아니기 때문에 (정의되어 있지 않다) 
	}
}



class Demo{
	public void display() {
		System.out.println("나는 원형 메소드");
	}
}