package JUnit;

import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import phl.RandomString;

public class Test2 {
	
	@Test
    public void test2length() {
    
		RandomString randomString = new RandomString();
        String result = randomString.generateString();
        assertEquals(20, result.length());
        
    }
	
	@Test
	public void test2Alphanumeric() {
		
		RandomString randomString = new RandomString();
		String result = randomString.generateString();
		assertTrue(StringUtils.isAlphanumeric(result));
		
	}
	
	@Test
	public void test2weak() {
		
		RandomString randomString = new RandomString();
		String result1 = randomString.generateString();
		String result2 = randomString.generateString();
		assertFalse(result1.equals(result2));
		
	}

}
