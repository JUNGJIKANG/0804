//캡슐화 클래스(Car.java 참조)
public class EncapsulationDemo {
	public static void main(String[] args) {
		Car sonata = new Car();
//		sonata.name = "소나타";
		sonata.setName("소나타");
//		sonata.price = 30_000_000;
		sonata.setPrice(30_000_000);
//		System.out.println("이름은 " + sonata.setName + ", 가격은 " + sonata.carPrice + " 원 입니다.");
		// 지금은 이렇게 사용불가능 캡슐화 되어있어서
		System.out.println("이름은 " + sonata.getName() + ", 가격은 옵션 미포함 " + sonata.getPrice() + " 원입니다.");
	}
}
