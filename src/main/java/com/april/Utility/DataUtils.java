package com.april.Utility;

import java.util.Random;

public class DataUtils {
	
	public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder randomString = new StringBuilder(length);

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }
        return randomString.toString();
    }
	
	public static String generateEmail(int length) {
		String email = generateRandomString(length) + "@gmail.com";
		return email;
	}

	public static String generateRandomNumberString(int length) {
        String numbers = "0123456789";
        StringBuilder randomNumberString = new StringBuilder(length);

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(numbers.length());
            randomNumberString.append(numbers.charAt(index));
        }
        return randomNumberString.toString();
    }

}
