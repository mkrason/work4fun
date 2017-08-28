package JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import phl.UpperString;


public class Test1 {

	@Test
    public void test1Null() {
		
        String str = null;
    
        UpperString upString = new UpperString();
        String result = upString.upperFirstLetter(str);
        assertEquals(null, result);
    }
	
	@Test
	public void test1Empty() {
		
		String str = "";
		
		UpperString upString = new UpperString();
		String result = upString.upperFirstLetter(str);
		assertEquals("", result);		
	}
	
	@Test
	public void test1Full() {
		
		String str = "To  jest tescik, 11 ** %% ++";
		
		UpperString upString = new UpperString();
		String result = upString.upperFirstLetter(str);
		assertEquals("To  Jest Tescik, 11 ** %% ++", result);		
	}
	
}

