package MyTestNp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPrctice {
	/*
	 * @Test(priority = 0) public void test() { System.out.println("ankita");
	 * 
	 * }
	 * 
	 * @Test(priority = 2, enabled=true) public void test1() {
	 * System.out.println("ankita1");
	 * 
	 * }
	 * 
	 * @Test(priority = 1) public void test2() { System.out.println("ankita2");
	 * 
	 * }
	 */
	/*
	 * @Test(timeOut= 100) public void test() throws InterruptedException {
	 * Thread.sleep(400); System.out.println("ankita");
	 * System.out.println("ankita");
	 * 
	 *
	 */

	/*
	 * @Test(invocationCount = 10, invocationTimeOut = 100) public void tes1t() {
	 * System.out.println("ankita"); System.out.println("ankita");
	 * 
	 * }
	 * 
	 * @Test(invocationCount = 10, threadPoolSize = 5) public void tes1t1() {
	 * System.out.println("ankita"); System.out.println("ankita");
	 * 
	 * }
	 */
	/*
	 * @Parameters({"environment", "Browser"})
	 * 
	 * @Test public void login2 (String environment, String browser ) {
	 * System.out.println(environment); System.out.println(browser); }
	 */

	/*
	 * @Test(groups = "sanity", priority = 1) public void tes1t2() {
	 * System.out.println("ankita1"); System.out.println("ankita1"); }
	 * 
	 * @Test (groups = "smoke", priority = 0) public void tes1t1() {
	 * System.out.println("ankita"); System.out.println("ankita"); }
	 */

	@DataProvider(name = "testdata") // this data that is used for testing
	Object[][] getData() {
		return new Object[][] { { "user1", "pwd2" }, { "user2", "pwd3" } };
	}

	@Test(dataProvider = "testdata") // data called from above dataprovider
	public void test(String user, String password) {
		System.out.println(user);
		System.out.println(password);
	}

}
