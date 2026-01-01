package in.dev_shiv_ansh.trajectory_backend.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Getter
@Setter
@Service
public class User {

    private UUID id;
    private String fullName;
    private String email;
}