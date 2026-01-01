package in.dev_shiv_ansh.trajectory_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"in.dev_shiv_ansh.trajectory_backend.*"})
public class TrajectoryBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(TrajectoryBackendApplication.class, args);
	}

}
