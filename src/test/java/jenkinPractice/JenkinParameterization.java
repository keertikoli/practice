package jenkinPractice;

import org.testng.annotations.Test;

public class JenkinParameterization {
@Test
public void parametersTest() {
	String browser = System.getProperty("b");
	String URL = System.getProperty("u");
	System.out.println(browser);
	System.out.println(URL);
}
}
