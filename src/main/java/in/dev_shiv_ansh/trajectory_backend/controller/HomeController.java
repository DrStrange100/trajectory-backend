package in.dev_shiv_ansh.trajectory_backend.controller;

import in.dev_shiv_ansh.trajectory_backend.constant.ApplicationConstant;
import in.dev_shiv_ansh.trajectory_backend.constant.RestConstant;
import in.dev_shiv_ansh.trajectory_backend.entity.User;
import in.dev_shiv_ansh.trajectory_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({RestConstant.BASE_URL})
public class HomeController {

    @Autowired
    private UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({RestConstant.HEALTH_CHECK})
    public String healthCheck() {
        return ApplicationConstant.SUCCESS;
    }

//    public List<User> getUsers(){
//        return userService.get
//    }
}
