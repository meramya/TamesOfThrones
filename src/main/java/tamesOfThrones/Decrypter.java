package tamesOfThrones;

public class Decrypter {
	
	private static final String lowerCaseAlphabets = "abcdefghijklmnopqrstuvwxyz";
	private static final String upperCaseAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String decrypt(String encrypted, int k) {
		StringBuilder decryptected = new StringBuilder();
	
		k = k % 26;
		if (k < 0) {
			k = k + 25;
		}
		for (int i = 0; i < encrypted.length(); i++) {
			int indexOfletter;
			char charOfindex = encrypted.charAt(i);
			if (Character.isAlphabetic(charOfindex)) {
				if (Character.isUpperCase(charOfindex)) {
					indexOfletter = upperCaseAlphabets.indexOf(encrypted.charAt(i));
					int indexofLetterToReplace = (indexOfletter + k) % 26;
					decryptected.append(upperCaseAlphabets.charAt(indexofLetterToReplace));
				} else if (Character.isLowerCase(charOfindex)) {
					indexOfletter = lowerCaseAlphabets.indexOf(encrypted.charAt(i));
					int indexofLetterToReplace = (indexOfletter + k) % 26;
					decryptected.append(lowerCaseAlphabets.charAt(indexofLetterToReplace));
				}
			} else {
				decryptected.append(encrypted.charAt(i));
			}
		}

		return decryptected.toString();
	}
}
