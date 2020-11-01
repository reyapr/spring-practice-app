package com.reyapr.mypracticeapp;

import com.reyapr.mypracticeapp.entity.User;
import com.reyapr.mypracticeapp.entity.dto.request.UserRequest;
import com.reytapr.mypracticeapp.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserControllerImpl {

  @Autowired
  private UserService userService;

  Mono<User> createUser(UserRequest request){
    return userService.createUser(request);
  }

}
