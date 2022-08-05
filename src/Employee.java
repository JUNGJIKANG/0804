
public class Employee {
	private String empno, empname, hiredate;
	private int salary;

	Employee(String empno, String empname, String hiredate, int salary) {
		// 메소드의 이름이 클래스명과 똑같고 리턴타입입이 없으면 생성자라고 한다.
		System.out.println("방금 객체가 생성되었습니다.");
		this.empno = empno;
		this.empname = empname;
		this.hiredate = hiredate;
		this.salary = salary;
	}

	public void myPrint() {
		System.out.printf("%s%s%d%s\n", this.empno, this.empname, this.salary, this.hiredate);
	}
}
