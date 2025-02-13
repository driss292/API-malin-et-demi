package fr.drisskaci.md_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MdApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MdApiApplication.class, args);
		Environment environment = context.getEnvironment();
		String port = environment.getProperty("server.port", "8080"); // 8080 par défaut si non défini
		System.out.println("🚀 API démarrée sur : http://localhost:" + port);
	}
}
