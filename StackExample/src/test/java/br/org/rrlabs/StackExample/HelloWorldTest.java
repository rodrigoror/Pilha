package br.org.rrlabs.StackExample;

import static junit.framework.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;
import br.org.rrlabs.StackExample.Outros.HelloWorld;

@RunWith(DemoiselleRunner.class)
public class HelloWorldTest {

	@Inject
	private HelloWorld helloWorld;

	@Test
	public void say() {
		assertNotNull(helloWorld);
		helloWorld.say();
	}
}
