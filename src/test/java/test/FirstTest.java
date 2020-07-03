package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class FirstTest extends BaseClass {
	
	@Test
    public void test() throws Exception {
        driver.get("https://www.qatouch.com/");
        Thread.sleep(5000);
        
        Assert.assertEquals("QA Touch: Free Test case management tool & Test management software", driver.getTitle());
    }

}
