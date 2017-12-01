import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InitializingVariablesTest {

	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@BeforeEach
	public void setUpStream() {
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void cleanupStreams() {
		System.setOut(null);
	}

	/*
	@Test
	public void sayHappyBirthdayTest() {
		InitializingVariables.sayHappyBirthday();
		assertEquals("HAPPY BIRTHDAY", outContent.toString().replace("\r\n", ""));
	}
	*/

}
