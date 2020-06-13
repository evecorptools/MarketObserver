package net.redirectme.squirrelacademy.marketobserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "net.redirectme.squirrelacademy.marketobserver")
public class MarketObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketObserverApplication.class, args);
	}

}
