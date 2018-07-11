package cn.leafw.zone.dms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"cn.leafw.zone.dms"})
public class DmsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmsWebApplication.class, args);
	}
}
