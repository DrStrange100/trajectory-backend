package in.dev_shiv_ansh.trajectory_backend.service.impl;

import in.dev_shiv_ansh.trajectory_backend.config.ApplicationProperties;
import in.dev_shiv_ansh.trajectory_backend.entity.User;
import in.dev_shiv_ansh.trajectory_backend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Autowired
    public UserServiceImpl(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

//    @Override
//    public List<User> getUsers(){
//        if(applicationProperties.get)
//
//    }

}