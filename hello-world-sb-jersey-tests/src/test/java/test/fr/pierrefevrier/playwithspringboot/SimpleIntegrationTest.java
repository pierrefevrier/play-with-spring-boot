package test.fr.pierrefevrier.playwithspringboot;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import fr.pierrefevrier.playwithspringboot.config.SpringConfig;

// see http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-testing
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringConfig.class)
@WebIntegrationTest(randomPort = true)
public class SimpleIntegrationTest {

	@Autowired
	EmbeddedWebApplicationContext server;

	// Inject actual HTTP port
	// (see http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-discover-the-http-port-at-runtime)
	@Value("${local.server.port}")
	int port;

	// Use Spring rest template
	final RestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void simpleTest() {

		final String response = restTemplate.getForObject("http://localhost:" + port + "/helloworld", String.class);

		Assert.assertThat(response, Matchers.equalTo("Hello World from Spring Boot with tests !"));
	}

}
