package net.redirectme.squirrelacademy.MarketObserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"net.redirectme.squirrelacademy", "org.openapitools.client", "org.openapitools.client", "org.openapitools.client.api"})
@EnableJpaRepositories(basePackages = {"net.redirectme.squirrelacademy"})
@EntityScan(basePackages =  {"net.redirectme.squirrelacademy"})

/*
@SpringBootApplication(scanBasePackages = {"*"})
@EnableJpaRepositories(basePackages = {"*"})
@EntityScan(basePackages =  {"*"})
*/
public class MarketObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketObserverApplication.class, args);
	}





}
