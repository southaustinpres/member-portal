package org.southaustinpres.memberportal;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HomepageTest {

	@Autowired
	private WebTestClient webClient;

	@Test
	public void homepageShouldRespondOk() throws Exception {
		webClient.get().uri("/")
			.exchange()
			.expectStatus().isOk();
	}

}
