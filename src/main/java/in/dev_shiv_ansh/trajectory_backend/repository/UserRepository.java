package in.dev_shiv_ansh.trajectory_backend.repository;


//import com.trajectory.backend.entity.User;
import in.dev_shiv_ansh.trajectory_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}