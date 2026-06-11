package io.github.lslight.goozzu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class GoozzuApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoozzuApplication.class, args);
	}

}
