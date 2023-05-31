package com.lambdafunction;

@FunctionalInterface
public interface UserResgistrationInterface {
	public abstract boolean userEntries(String value) throws InvalidUserInputException;

}
