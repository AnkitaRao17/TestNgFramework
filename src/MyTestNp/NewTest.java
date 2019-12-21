package MyTestNp;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	/*  @Test (priority= 1)
	  public void f() {
		  System.out.println("data");
	  }
	  
	  @Test(priority= 2)
	  public void Loginwithvaliddata() {
		  System.out.println("valid data");
	  }
	  
	  @Test(priority= 0)
	  public void loginwithinvaliddata() {
		  System.out.println(" invalid data");
	  }
	  
	  @Test(priority= 3)
	  public void loginwithEmailid() {
		  System.out.println(" email id");
	  }*/
		
	  /*
	*/
	  
		/*
		 * @Test(expectedExceptions = ArithmeticException.class) public void login1() {
		 * int i =10/0; }
		 */
	  
	  
		/*
		 * @Test(invocationCount = 5, threadPoolSize = 5 ) public void login1() {
		 * System.out.println(" email id"); }
		 */
		
		/*
		 * @Test(invocationCount = 5, invocationTimeOut = 2000 ) public void login1() {
		 * System.out.println(" email id"); }
		 */
		 
		/*
		 * @Test(successPercentage = 60) public void login1() {
		 * System.out.println(" email id"); }
		 */
		
		/*
		 * @Test public void login1() { System.out.println(" email id"); int i = 10/0; }
		 * 
		 * @Test(dependsOnMethods = "login1") public void login2() {
		 * System.out.println(" email id1"); }
		 */
		
		/*
		 * @Test public void login1() { System.out.println(" email id"); int i = 10/0; }
		 * 
		 * @Test(dependsOnMethods = "login1", alwaysRun = true) public void login2() {
		 * System.out.println(" email id1"); }
		 */
		
		/*
		 * @Parameters({"environment","browser" }) // this is run as per declared in
		 * Testng.xml file, this used to run in framework when we want to execute
		 * particular method in environment or browsers
		 * 
		 * @Test public void login2(String environment, String browser ) {
		 * System.out.println(environment); System.out.println(browser); }
		 */
		
		/*
		 * @Test(groups = "smoke") public void login2() { System.out.println("test1"); }
		 * 
		 * @Test(groups = "sanity") public void login3() { System.out.println("test3");
		 * }
		 * 
		 * @Test public void login4() { System.out.println("test5"); }
		 */
		
		/*
		 * @DataProvider(name = "testdata") // this data that is used for testing
		 * Object[][] getData(){ return new Object[][] { {"user1","pwd1"},
		 * {"user2","pwd2"} }; }
		 */
		
		@Test(dataProvider = "testdata", groups= {"smoke"}, dataProviderClass = DataProviderTestClass.class ) //data called  from above dataprovider
		public void test (String user,String password) {
		System.out.println(user);	
		System.out.println(password);
		}

}
