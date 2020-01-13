package com.genil.common.discovery.nflxeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NflxEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NflxEurekaNamingServerApplication.class, args);
	}

}
