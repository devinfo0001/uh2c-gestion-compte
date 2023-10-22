package ma.uh2c.uh2c.gscompte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@RefreshScope
public class Uh2cGestionCompteApplication {

	public static void main(String[] args) {
		SpringApplication.run(Uh2cGestionCompteApplication.class, args);
	}

}
