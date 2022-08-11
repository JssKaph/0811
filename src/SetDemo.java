import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		String [] array = {"박지민", "홍지민", "박지민", "한지민", "한지민", "이지민"};
		for(String str : array) {
			hashSet.add(str);
			treeSet.add(str);
		}
//		System.out.println(hashSet.size()); // Set은 중복을 거부하기 때문에 4개 밖에 없다.
		System.out.println(hashSet);
		System.out.println(treeSet); //정렬 저장
	}
}
