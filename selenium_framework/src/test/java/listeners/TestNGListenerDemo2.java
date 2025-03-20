package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo2 {
	
	@Test
	public void test4() {
		System.out.println(" i am inside Test 4");
	}
	
	@Test
	public void test5() {
		System.out.println(" i am inside Test 5");
//		Assert.assertTrue(false);
	}
	
	@Test
	public void test6() {
		System.out.println(" i am inside Test 6");
	}
	

}
