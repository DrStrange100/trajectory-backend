package in.dev_shiv_ansh.trajectory_backend.controller;

import in.dev_shiv_ansh.trajectory_backend.entity.User;
import in.dev_shiv_ansh.trajectory_backend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> homeData() {
        return userService.getAllUsers();
    }
}
