package IPChecker;

import static org.junit.Assert.*;

import org.junit.Test;

public class IPCheckerTest
{
	@Test
	public void validatingTestOne() {
		assertFalse(IPChecker.validate("3.4.5.255"));
	}
	@Test
	public void validatingTestTwo() {
		assertFalse(IPChecker.validate("3.4.5.0"));
	}
	@Test
	public void validatingTestSix() {
		assertFalse(IPChecker.validate("3.0.225"));
	}
	@Test
	public void validatingTestThree() {
		assertTrue(IPChecker.validate("3.4.5.9"));
	}
	@Test
	public void validatingTestFour() {
		assertTrue(IPChecker.validate("3.78.5.6"));
	}

}

