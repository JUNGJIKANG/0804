import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class InputTest {
	Student jikang;
	
	@Before //항상 테스트 전 하겠다는 의미
	public void init() {
		jikang=new Student();
	}
	@Ignore @Test //annotation(JUnit에서 쓰이는 annotation이다. java의 annotation이 아니다. 검사하려는 unit위에 검사함.
	public void testInput() {
		Input input=new Input();
		input.input(jikang);
		assertEquals("정지강", jikang.name); //기대하는 값과 실제값이 같은지 물어봤음. 같으면 초록색, 다르다면 빨강색 출력
	}
	@Test
	public void testCalc(){
		Calc calc=new Calc();
		jikang.kor=100; jikang.eng=100; jikang.mat=100; 
		calc.Calc(jikang);
		assertEquals(300,jikang.tot);
		assertEquals((int)(300/3),(int)jikang.avg);
		assertEquals('A',jikang.grade);		
	}
}
