//캡슐화 클래스
public class Car {
	private String name;
	private int price;

	public Car() { // 기본 생성자, 괄호안에 아무것도 없는 녀석을 지칭.
		System.out.println("방금 객체가 생성되었습니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void myPrint() {
		System.out.println(this);
	}

//오른쪽 마우스-get source-generator getter and stter에서 설정
//	public void setName(String nickname) {
//		this.name = nickname;
//		// this가 있으면 나의 라는 의미가 생김
//		// this가 붙어 있으면 멤버변수로 취급(지역변수와 같은 이름 사용해도 무관)
//	}
//
//	public void setPrice(int carprice) {
//		price = carprice;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public int getPrice() {
//		return price;
//	}
}