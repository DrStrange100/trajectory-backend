package in.dev_shiv_ansh.trajectory_backend.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
//@AllArgsConstructor
@ConfigurationProperties(prefix ="trajectory")
public class ApplicationProperties {
    private boolean mockApi;
}
