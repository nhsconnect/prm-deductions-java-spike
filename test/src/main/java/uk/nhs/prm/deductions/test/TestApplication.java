package uk.nhs.prm.deductions.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class TestApplication {

	public static void main(String[] args) {
		// Launch the application
		SpringApplication.run(TestApplication.class, args);
	}

}
