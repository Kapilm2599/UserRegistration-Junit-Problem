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

}
