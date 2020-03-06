package tech.dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// same as @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication(scanBasePackages={"tech.dev"})
public class SampleSpringBootMongoDbApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SampleSpringBootMongoDbApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootMongoDbApplication.class, args);
		LOGGER.debug("Spring Boot application ready");
	}

}
