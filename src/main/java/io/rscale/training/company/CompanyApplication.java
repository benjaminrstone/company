package io.rscale.training.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CompanyApplication {

	public static void main(String[] args) {
	    System.out.println("TEST LINE");
	    SpringApplication.run(CompanyApplication.class, args);
	}
}
