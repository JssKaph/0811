import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		//1~6까지의 랜덤넘버
		int rand = (int)(Math.random() * 6 + 1); // *범위 + 최솟값
		Random r = new Random();
		int rand1 = r.nextInt(6) + 1; //() 맥시멈 숫자 + 최솟값
		System.out.println(rand+", "+rand1);
	}
}