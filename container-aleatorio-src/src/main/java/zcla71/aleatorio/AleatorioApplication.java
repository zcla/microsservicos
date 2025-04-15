package zcla71.aleatorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AleatorioApplication {
	public static void main(String[] args) {
		SpringApplication.run(AleatorioApplication.class, args);
	}
}
