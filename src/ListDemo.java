import java.util.Stack;
/*
 * Stack : LIFO Last Input First Out
 */
public class ListDemo {
	public static void main(String[] args) {
		Stack<String>stack = new Stack<String>();
		String [] array = {"박지민", "홍지민", "박지민", "한지민", "한지민", "이지민"};
		for(String str: array) {
			stack.push(str); // last input first out
		}
//		System.out.println(stack.pop()); // 포인터가 내려감
//		System.out.println(stack.pop());

//		System.out.println(stack.peek()); // 포인터가 안내려감
//		System.out.println(stack.peek());
		
		System.out.println(stack.search("홍지민")); // 위치를 찾아줌 (위에서 부터)

	}
}
