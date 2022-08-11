import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) /*두번째 방법 throws FileNptFoundException*/{  
//		File file = new File("C:/Temp/sunguk_utf8.dat");
//		// 첫번째 방법, 권장
//		try {
//			Scanner sc = new Scanner(file, "utf-8");
//		} catch (FileNotFoundException e) { // try catch를 꼭 써야하는 checked exception이다 ex) FileNotFountException
//			System.out.println("File Not Found");
//		}
		System.out.print("숫자형 글자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine(); 
		int su = Integer.parseInt(num); // NumberFormatException 발생
		System.out.printf("su = %d\n", su);
	}
}
