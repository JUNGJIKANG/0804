/*
생성자의 역할은 멤버변수(필드, property)의 초기값
파라미터가 없는 생성자를 기본 생성자라고 한다.
파라미터가 없는 기본생성자는 어떻게 멤버변수를 초기화할 것인가
0, 0.0, false, '\0' or'\u0000', null과 같은 값을 나타내는 것(각 변수의 타입에 맞게 출력)
기본생성자는 항상 해당 클래스의 생성자가 한개도 없을 때 자동으로 만들어준다.
만일 한개라도 생성자가 존재하면 컴파일러는 자동으로 생서하지 않는다.
*/
public class ConstuctorDemo2 {
	public static void main(String[] args) {
//		Tiger tiger=new Tiger(); //기본 생성자
//		System.out.println(tiger.grade);
		MyCalander mc = new MyCalander();
		System.out.println("오늘은 " + mc.year + "년 " + mc.month + "월 " + mc.day + "입니다.");
	}
}

class MyCalander {
	int year, month, day;

	public MyCalander() {
	}

	public MyCalander(int year) {
	}

	public MyCalander(int year, int month) {
	}

	public MyCalander(int year, int month, int day) { // 파라미터가 있어서 기본생성자가 아님.
		this.year = 2022;
		this.month = 8;
		this.day = 4;
	}
}

class Tiger {
	String name;
	int age;
	boolean flag;
	double weight;
	char grade;
}