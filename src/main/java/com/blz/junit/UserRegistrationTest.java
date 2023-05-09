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
		
		@Test
		public void givenPhoneNumber_WhenProper_shouldReturnTrue() {
			boolean result = userRegistration.mobileNumber("91 8709177407");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenPhoneNumber_WhenNotProper_shouldReturnFalse() {
			boolean result = userRegistration.mobileNumber("785415451");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void givenPassword_WhenProper_ShouldReturnTrue() {
			boolean result = userRegistration.password("Kapilmahajan");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenPassword_WhenNotProper_ShouldReturnFalse() {
			boolean result = userRegistration.password("kapilmahajan");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
			boolean result = userRegistration.password2("Qwertyu19");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
			boolean result = userRegistration.password2("qwerrty");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
			boolean result = userRegistration.password3("Kapil@123");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
			boolean result = userRegistration.password3("ka@ma");
			Assert.assertEquals(false, result);
			
		}	
		
		@Test
		public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
			boolean result = userRegistration.password4("Kapilmahajan@1999");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
			boolean result = userRegistration.password4("Kapill99");
			Assert.assertEquals(false, result);
		}	
		
		@Test
		public void givenEmail8_WhenNotProper_ShouldReturnTrue() {
			boolean result = userRegistration.emailIdValidator("abc.xyz@bl.co.in");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
			boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
			Assert.assertEquals(false, result);
		}	
		

}
