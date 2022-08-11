import java.util.Scanner;

// 예외상황 ex) 연산에 0을 집어넣을때
// java.lang.ArithmeticException: / by zero 0으로 나눠서 생긴 오류

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int second = sc.nextInt();
		try { // 예외 잡기 시작, try로 묶는다.
		System.out.printf("%d / %d = %d\n", first, second, (first/second));
		}catch(NullPointerException ex) { // 타입이 일치하지 않으면 오류가 생김 , switch 처럼 사용가능
			System.out.println("NullPointerException");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(NegativeArraySizeException ex) {
			System.out.println("NegativeArraySizeException");
//		}catch(ArithmeticException ex) { // 타입이 일치하기 때문에 성공
//			System.out.println("ArithmeticException, 여기서 잡음");
		}catch(RuntimeException ex) { // 오류의 부모, 다 성공
			System.out.println("RuntimeException, 여기서 잡음");
		}
		/*
		 * Multiple Catch Block : 여러개의 Exception Type을 열거하는 방법
		 * - 주의할 점 : 위 아래 순서가 있다. 위쪽은 자식 Exception, 아래쪽은 부모 Exception
		 * 
		 */
	}
}
