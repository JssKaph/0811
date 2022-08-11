/*
 * 사용자 정의형 Exception
 * 1. 누구의 자식인가? RuntimeException 계열인가? 아닌가?
 * 2. 생성자를 잘 만들자.
 */
public class KoreanException extends RuntimeException { //RuntimeExpeption 의 자식 try catch 사용 없이 가능
	public KoreanException(String msg) {
		super(msg);
	}
}
