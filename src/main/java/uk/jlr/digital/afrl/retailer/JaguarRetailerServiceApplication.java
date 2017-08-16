package uk.jlr.digital.afrl.retailer;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import uk.jlr.digital.afrl.common.BaseApplication;

@Configuration
public class JaguarRetailerServiceApplication extends BaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaguarRetailerServiceApplication.class, args);
	}
}
