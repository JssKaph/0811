
public class GenericDemo {
	public static void main(String[] args) {
		Car<Integer> car = new Car<Integer>(5); // 자동차는 반드시 정수만 넣어야한다. 정수만 넣는 한정적인 클래스
		int result = car.getValue();
		Car<Double> car1 = new Car<Double>(5.5);
		double result1 = car1.getValue();
		Car<String> car2 = new Car<String>("Hello");
		String result2 = car2.getValue();
	}
}

class Car<T>{ // <T> Generic Car, 만능형 Car 
	private T Value;
	public Car(T value) {
		this.Value = value;
	}
	public T getValue() {
		return Value;
	}
	public void setValue(T value) {
		this.Value = value;
	}
}