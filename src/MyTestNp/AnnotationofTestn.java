package MyTestNp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationofTestn {
	@BeforeSuite
	public void test1()
	{
		System.out.println("before suite");
	}
	@BeforeTest
	public void test2()
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void test3()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void test4()
	{
		System.out.println("before method");
	}
	@Test // test case (Sequence is asked in interview)
	public void test5()
	{
		System.out.println("test in");
	}
	@Test // test case
	public void test51()
	{
		System.out.println("test in2");
	}
	
	@AfterMethod
	public void test6()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void test9()
	{
		System.out.println("after class");
	}
	@AfterTest
	public void test7()
	{
		System.out.println("after Test");
	}
	
	@AfterSuite
	public void test8()
	{
		System.out.println("after Suite");
	}
}
