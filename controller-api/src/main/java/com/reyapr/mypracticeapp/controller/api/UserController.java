package com.reyapr.mypracticeapp.controller.api;

import com.reyapr.mypracticeapp.entity.User;
import com.reyapr.mypracticeapp.entity.dto.request.UserRequest;
import reactor.core.publisher.Mono;

public interface UserController {
  Mono<User> createUser(UserRequest userRequest);
}
