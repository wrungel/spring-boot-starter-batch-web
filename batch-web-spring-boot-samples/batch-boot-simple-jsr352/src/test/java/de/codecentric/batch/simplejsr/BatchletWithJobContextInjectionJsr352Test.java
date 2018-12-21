package de.codecentric.batch.simplejsr;

import org.junit.Test;
import org.springframework.batch.test.JsrTestUtils;

import java.util.concurrent.TimeoutException;

public class BatchletWithJobContextInjectionJsr352Test {
	
	@Test
	public void testTraditionalJsr352() throws TimeoutException{
		JsrTestUtils.runJob("batchletWithJobContextInjectionJob", null, 1000000);
	}

}
