import java.util.Scanner;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : "); 
		int kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		try {
			Student chulsu = new Student(kor, math);
			System.out.println(chulsu);
		} catch (KoreanException e) {
			System.out.println(e.getMessage());
		} catch (MathException e) {
			System.out.println(e.getMessage());
		}  	 
		
	}         
}

class Student{
	private int kor, math;

	public Student(int kor, int math) throws KoreanException, MathException{ //koreanE 는 런타임 오류인 반면 MathE는 throws 하지않으면 컴파일 x
		if (kor >=0 && kor <=100)  this.kor = kor;
		else throw new KoreanException("국어 점수는 0부터 100까지 입니다.");
		if(math >=0 && math <=100) this.math = math;
		else throw new MathException("수학 점수는 0부터 100까지 입니다.");
		
	}

	@Override
	public String toString() {
		return String.format("Student [kor=%s, math=%s]", kor, math);
	}
}