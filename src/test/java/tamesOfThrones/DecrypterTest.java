package tamesOfThrones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DecrypterTest extends Decrypter {

	@Test
	void test() {
		Decrypter decrypter = new Decrypter();
		assertEquals("panda", decrypter.decrypt("kviyv", 5));
		
		 
	}

}
