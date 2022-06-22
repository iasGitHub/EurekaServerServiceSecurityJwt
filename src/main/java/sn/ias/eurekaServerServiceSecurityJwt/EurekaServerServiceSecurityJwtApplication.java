package sn.ias.eurekaServerServiceSecurityJwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerServiceSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerServiceSecurityJwtApplication.class, args);
	}

}
