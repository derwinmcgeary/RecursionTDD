import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RecursionTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void factorialMinus1(){
		Factorial f = new Factorial();
		long result = f.calculate(-1);
		assertEquals(-1, result);
	}

	@Test
	public void factorial0(){
		Factorial f = new Factorial();
		long result = f.calculate(0);
		assertEquals(1, result);
	}
	
	@Test
	public void factorial1(){
		Factorial f = new Factorial();
		long result = f.calculate(1);
		assertEquals(1,result);
	}
	
	@Test
	public void factorial2(){
		Factorial f = new Factorial();
		long result = f.calculate(2);
		assertEquals(2,result);
	}

	@Test
	public void factorial3(){
		Factorial f = new Factorial();
		long result = f.calculate(3);
		assertEquals(6,result);
	}

	@Test
	public void factorial13(){
		Factorial f = new Factorial();
		long result = f.calculate(13);
		assertEquals(6227020800L,result);
	}
	
	@Test
	public void factorialMaxInt() {
		Factorial f = new Factorial();
		exception.expect(StackOverflowError.class);
		long result = f.calculate(Integer.MAX_VALUE);

	}

}
