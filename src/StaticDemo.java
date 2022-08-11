/**
 * 
 * <font color='red' size='5'> Static 용법 4가지</font>
 * <ol> ordered list
 * 		<li><b> static variable</b> : 참조없이 클래스의 이름으로 접근하기 위한 공유 변수</li>
 * 		<li><b> static method</b> : 참조없이 클래스의 이름으로 메소드를 접근하기 위해서</li>
 * 		<li><b> static initialization block</b> : static 변수와 상수의 초기화</li>
 * 		<li><b> static class</b></li> : 
 * </ol>
 * @author JSS
 * @version 1.0
 * @since 2022-08-11
 *
 */

public class StaticDemo {
	/**
	 *  맴버 변수
	 */
	// 생성자가 생성
	private String name;		// 멤버 변수
	private final double PI;	// 멤버 상수
	//
	private static int age; 	// 스태틱 변수
	private static final boolean FLAG; // 스태틱 상수

	{ //initialization block, 제일 먼저 실행이 됨
		this.name = "한지민";
		System.out.println("나는 생성자보다 먼저 호출 되는데, 다시는 재호출할 수 없다.");
	}

	public StaticDemo() {
		this.PI = 3.141596;
		System.out.println("나는 생성자다.");
	}
	
	static { //static initialization block, 스태틱 변수,상수 초기화
		age = 26; // 스태틱 변수 초기화
		FLAG = true; // 스태틱 상수 초기화 
		System.out.println("나는 스태틱 초기화 블록이다. 항상 제일 먼저 메모리에 올라온다.");
	}
	/**
	 * 
	 * 프로그램의 시작점
	 * @param args : String Array
	 * @return Nothing
	 * @see https://www.naver.com, ~~를 참조하세요
	 */
	public static void main(String[] args) {
		 System.out.println("나이 = "+age);
		 System.out.println("FLAG =" + FLAG); // 멤버들은 나오지않는다.
		 StaticDemo sd = new StaticDemo(); // 멤버 생성
		 System.out.println("이름 = " +sd.name);
		 System.out.println("PI = " +sd.PI);
		
	}
}
