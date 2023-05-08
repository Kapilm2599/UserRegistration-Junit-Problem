package com.blz.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	 UserRegistration userRegistration = new UserRegistration();
	 
	    @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.firstName("Kapil");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.firstName("kapil");
	        Assert.assertEquals(false, result);
	    }
	    
	    @Test
		public void givenLastName_whenProper_ShouldReturnTrue() {
			boolean result = userRegistration.lastName("Mahajan");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenLastName_WhenNotProper_ShouldReturnFalse() {
			boolean result = userRegistration.lastName("mahajan");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void givenEmail_WhenProper_ShouldReturnTrue() {
			boolean result = userRegistration.email("abc.xyz@bl.co.in");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenEmail_WhenNotProper_ShouldReturnFalse() {
			boolean result = userRegistration.email("abc&.com");
			Assert.assertEquals(false, result);
		}

}
