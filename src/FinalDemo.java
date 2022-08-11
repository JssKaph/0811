/**
 * <h1>Final 용법 3가지</h1>
 * <ul>
 * unordered list
 * <li><b>Final Variable 변수</b> : 자바의 상수</li>
 * <li><b>Final Method 메소드</b> : Override 금지</li>
 * <li><b>Final Class 클래스</b> : 상속의 금지</li>
 * </ul>
 * 
 * @author JSS
 * @version 1.1
 * @serial 2022-08-11
 *
 */
public class FinalDemo extends Parent {
	private final double PI = Math.PI; // 멤버 상수
	private static final boolean FLAG = true; // static 상수

	public static void main(String[] args) {
		final String NAME = "한지민"; // 지역상수
//		NAME = "박지민"; // X상수는 초기화 이후에 바꿀 수 없다.
	}
	
	// 부모 클래스에서 추상 메소드를 만들면 자식은 무조건 재정의 해야한다 시험에 나옴
//	@Override
//	public void print() {
//		System.out.println("나는 자식의 메소드");
//	}
}
final class Parent{ // final class 이 안에 있는 모든 변수 메소드는 final이 된다.
	public void display() {
		System.out.println("나는 부모의 메소드");
	}
}

//abstract class Super {
//	public final void display() { // final void 상속 금지, abstract와 final은 상극이다. (추상과 final은 같이 사용할 수 없다.) 
//		System.out.println("나는 부모의 메소드");
//	}
//
//	public abstract void print();
//}