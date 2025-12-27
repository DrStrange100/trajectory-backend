package in.dev_shiv_ansh.trajectory_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class TrajectoryBackendApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		// Set system properties from .env
		System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
		System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
		System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
		SpringApplication.run(TrajectoryBackendApplication.class, args);
	}

}
