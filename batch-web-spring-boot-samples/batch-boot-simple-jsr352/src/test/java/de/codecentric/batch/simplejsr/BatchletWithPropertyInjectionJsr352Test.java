package de.codecentric.batch.simplejsr;

import org.junit.Test;
import org.springframework.batch.test.JsrTestUtils;

import java.util.Properties;
import java.util.concurrent.TimeoutException;

public class BatchletWithPropertyInjectionJsr352Test {
	
	@Test
	public void testTraditionalJsr352() throws TimeoutException{
		Properties params = new Properties();
		params.setProperty("datakey", "xxx");
		params.setProperty("datakey2", "xxx2");
		JsrTestUtils.runJob("batchletWithPropertyInjectionJob", params, 1000000);
	}

}
