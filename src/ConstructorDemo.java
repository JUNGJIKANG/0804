/*this메소드를 사용할 떄의 조건
1. 반드시 생성자 메소드에서만 사용해야하고
2. 생성자 메소드 내의 반드시 첫번째 줄에 와야한다.
*/

public class ConstructorDemo {
	public static void main(String[] args) {
		Sawon jikang = new Sawon();
		System.out.println(jikang.name);
		System.out.println(jikang.salary);
	}
}

class Sawon {
	String name;
	int salary;

	public Sawon(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Sawon(String name) {
		this(name, 99999);
	}

	public Sawon(int salary) {
		this("Unknown", salary);
	}

	public Sawon() {
		this("Unknown", 1000000);
	}
}