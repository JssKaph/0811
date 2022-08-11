import java.util.Vector;

public class ListDemo1 {
	public static void main(String[] args) {
//		Vector<String> vector = new Vector<String>();
//		System.out.println(vector.capacity()); // 용량 10개
//		System.out.println(vector.size()); //방갯수0개
//		vector.add("한지민");
//		System.out.println(vector.capacity()); // 용량은 그대로 10개
//		System.out.println(vector.size()); //방갯수 1개
		
		Vector<String> vector = new Vector<String>(5, 3);
		System.out.printf(vector.capacity() + ", ");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.printf(vector.capacity() + ", ");
		System.out.println(vector.size());
		vector.add("한지민");
	}	
}
