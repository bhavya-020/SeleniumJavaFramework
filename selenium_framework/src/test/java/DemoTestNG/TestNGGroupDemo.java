package DemoTestNG;

import org.testng.annotations.Test;


public class TestNGGroupDemo {
	
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("this is test1 ");
		
	}
	
	@Test(groups = {"sanity", "smoke"})
	public void test2() {
		System.out.println("this is test2 ");
		
	}
	@Test(groups = {"window.regression"})
	public void test3() {
		System.out.println("this is test3 ");
		
	}
	
	@Test
	public void test4() {
		System.out.println("this is test4 ");
		
	}

}
