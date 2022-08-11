import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * Java에서 날짜/시간을 처리하는 5가지 방법
 * 1. java.util.Date class
 * 2. java.util.Clalendar class
 * 3. java.text.DateFormat class
 * 4. java.text.SimpleDateFormat class
 * 5. printf()
 */
public class UtilityClassDemo {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		//첫번째 방법
//		System.out.println(now.getTime()); // 1660199979137 2022-08-11 15:40
//		File file = new File("C:/Temp/sungjuk_utf8.dat");
//		long last = file.lastModified(); // 마지막 수정 시간 1659919506842
//		System.out.println(last); 
//		Date createTime = new Date(last);
//		System.out.println(createTime);
		
		//두번째 방법
//		Date before = new Date(1660199979137L);
//		System.out.println(before);
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"년"+month+"월"+day+"일 입니다.");
		
		//세번째 방법, 언어, 지역 지원
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.FRENCH); 
		System.out.println(df.format(new Date()));
		
		//네번째 방법
		String pattern = "오늘은 YYYY년 MM월 DD일 입니다.";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		//다섯 번째 방법
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다.\n", new Date());
	}
}
