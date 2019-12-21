package MyTestNp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestClass {
	@DataProvider(name = "testdata") // this data that is used for testing 
	public Object[][] getData(){
		return new  Object[][] {
			{"user","pwd1"},
			{"user2","pwd2"}
		};
	}
}
